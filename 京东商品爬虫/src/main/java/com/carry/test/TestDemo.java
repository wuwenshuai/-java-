package com.carry.test;

import com.carry.util.HttpUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

public class TestDemo {

    @Autowired
    private HttpUtils httpUtils;

   @Test
    public  void test1() throws IOException {
       //String s = httpUtils.doGet1("https://www.jd.com");
      // String s = doGet1();
       Connection connect = Jsoup.connect("https://search.jd.com/Search?keyword=%E6%89%8B%E6%9C%BA&enc=utf-8&qrst=1&rt=1&stop=1&vt=2&wq=%E6%89%8B%E6%9C%BA&cid2=653&cid3=655&s=119&click=0&page=1");
       Document document = connect.get();
       Element body = document.body();

       System.out.println(body);
   }

    public String doGet1(){
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet("https://search.jd.com/Search?keyword=%E6%89%8B%E6%9C%BA&enc=utf-8&qrst=1&rt=1&stop=1&vt=2&wq=%E6%89%8B%E6%9C%BA&cid2=653&cid3=655&s=119&click=0&page=1");
        //HttpGet httpGet = new HttpGet("https://www.jd.com");
        CloseableHttpResponse response = null;
        try {
            response = httpClient.execute(httpGet);
            if (response.getStatusLine().getStatusCode()==200){
                HttpEntity entity = response.getEntity();
                String string = EntityUtils.toString(entity, "utf-8");
                System.out.println(string);
                return string;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                response.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
