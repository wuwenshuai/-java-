package com.carry.ItemTask;


import com.carry.dao.BaiduNewsDao;
import com.carry.pojo.BaiduNews;
import com.carry.service.BaiDuNewsService;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class BaiDuNewsTask {

    @Autowired
    private BaiDuNewsService baiDuNewsService;

    @Scheduled(fixedDelay = 10*1000) //间隔多长时间进行下一次任务
    public void baiDuNewsTask() throws Exception{

        //抓取的url
        String url = "http://top.baidu.com/buzz?b=1";
        Document document = Jsoup.connect(url).get();
        getElementAndInsert(document,baiDuNewsService,"实时热点");

        //获取新闻热点
        Elements lis = document.select("#flist li");
        for (int i = 2; i <lis.size(); i++) {
            String title = lis.get(i).select("a").attr("title");
            String href = "http://top.baidu.com"+lis.get(i).select("a").attr("href").substring(1);
            getElementAndInsert(Jsoup.connect(href).get(),baiDuNewsService,title);
        }



    }
    public static void getElementAndInsert(Document document,BaiDuNewsService baiDuNewsService,String type){
        Elements elements = document.select("#main > div.mainBody > div > table tr");
        for (Element element : elements) {

            //抓取keyword
            String keyWord = element.select(".list-title").text();
            //抓取相关连接
            String clazz = element.select(".tc").text();
            //抓取搜索指数
            String tempNum = element.select(".last").text();
            //int searchNum = Integer.parseInt(tempNum);
            int num;
            try {
                num = Integer.parseInt(tempNum);
            } catch (NumberFormatException e) {
                System.out.println("Debug");
                // 非数字的字符串, 全部跳过
                continue;
            }
            BaiduNews baiduNews = new BaiduNews();
            baiduNews.setId(null);
            baiduNews.setKeyword(keyWord);
            baiduNews.setClazz(clazz);
            baiduNews.setSearchNum(num);
            baiduNews.setType(type);
            baiDuNewsService.save(baiduNews);
            System.out.println("插入完成-------------："+baiduNews.getType());

        }
    }
}
