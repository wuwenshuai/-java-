package com.carry;

import org.apache.commons.io.FileUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.net.URL;

public class TestJsoup {

    @Test
    public void test() throws  Exception{


        Document document = Jsoup.parse(new URL("http://www.itcast.cn"), 1000);
        String title = document.getElementsByTag("title").first().text();
        System.out.println(title);
    }

    /**
     * 解析字符串
     */
    @Test
    public void testString() throws Exception{

        //利用io工具类读取一个文件
        String doc = FileUtils.readFileToString(new File("F:\\讲义+笔记+资料\\流行框架\\65.会员版(2.0)-就业课(2.0)-Vue\\91.Vue\\Vue\\源码\\day01_eesy_vue\\src\\main\\webapp\\demo1.html"));
        //解析字符串
        Document document = Jsoup.parse(doc);
        String title = document.getElementsByTag("title").first().text();
        System.out.println(title);
    }
}
