package com.carry.ItemTask;

import com.carry.pojo.Item;
import com.carry.service.ItemService;
import com.carry.util.HttpUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Date;
import java.util.List;

@Component
public class ItemTask {

    @Autowired
    private HttpUtils httpUtils;

    @Autowired
    private ItemService itemService;


   // @Scheduled(fixedDelay = 100*1000) //间隔多长时间进行下一次任务
    public void itemTask() throws Exception{

        //需要解析的地址
        String url = "https://search.jd.com/Search?keyword=%E6%89%8B%E6%9C%BA&enc=utf-8&qrst=1&rt=1&stop=1&vt=2&wq=%E6%89%8B%E6%9C%BA&cid2=653&cid3=655&s=119&click=0&page=";
        for (int i = 1; i < 10; i=i+2) {
           // String html = httpUtils.doGetHtml(url + i);
            //解析页面，并存储
            this.parse(url+i);
        }
        System.out.println("手机抓取完成");



    }


    private void parse(String html) throws Exception {

        //获取spu
       // Document document = Jsoup.parse(html);
        Document document = Jsoup.connect(html).get();
        Elements elements = document.select("div#J_goodsList>ul>li");
        for (Element element : elements) {
            String attr = element.attr("data-spu");
            long spu = Long.parseLong(attr);
            //获取sku
            Elements skuElements = element.select("li.ps-item");
            for (Element skuElement : skuElements) {
                //获取sku
                String attr1 = skuElement.select("[data-sku]").attr("data-sku");
                long sku = Long.parseLong(attr1);
                //根据sku根据商品是否被保存过
                Item item = new Item();
                item.setSku(sku);
                List<Item> items = itemService.findAll(item);
                if (items.size()>0){
                    continue;
                }
               //保存商品信息的封装
                item.setSpu(spu);
                //获取商品的详情信息的url
                String itemDescUrl = "https://item.jd.com/"+sku+".html";
                item.setUrl(itemDescUrl);
                //设置商品的图片
                String picUrl ="https:"+skuElement.select("img[data-sku]").first().attr("data-lazy-img");
                System.out.println("picUrl:"+picUrl);
                picUrl = picUrl.replace("/n9/","/n1/");
                item.setPic(picUrl);
                System.out.println(item);
                this.httpUtils.doGetImg(picUrl);


                //获取标题
                String title = Jsoup.connect(itemDescUrl).get().select("div.sku-name").text();
                item.setTitle(title);
                //获取价格
               // String price = Jsoup.connect(itemDescUrl).get().select("div.dd > span.p-price > span.price.J-p-"+item.getSku()).text();
               // double v = Double.parseDouble(price);
                //item.setPrice(v);

                item.setCreated(new Date());
                item.setUpdated(new Date());

                this.itemService.save(item);



            }

        }
    }
}
