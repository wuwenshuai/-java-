package com.carry.util;

import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.util.EntityUtils;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.UUID;

@Component
public class HttpUtils {
    public HttpUtils(){
        this.cm = new PoolingHttpClientConnectionManager();
        this.cm.setMaxTotal(100);
        this.cm.setDefaultMaxPerRoute(10);
    }
    private PoolingHttpClientConnectionManager cm;

    //根据请求地址下载页面
    public String doGetHtml(String url){

        //获取httpclient对象，设置url地址
        CloseableHttpClient httpClient = HttpClients.custom().setConnectionManager(this.cm).build();
        HttpGet httpGet = new HttpGet(url);
        //设置请求信息
        httpGet.setConfig(this.getConfig());
        //发起请求，获取响应
        CloseableHttpResponse response = null;
        try {
          response = httpClient.execute(httpGet);
          if (response.getStatusLine().getStatusCode()==200){
              if (response.getEntity()!=null){
                  String content = EntityUtils.toString(response.getEntity(), "utf8");
                  return content;

              }else {
                  return "没有查到数据";
              }
          }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (response!=null){
                try {
                    response.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return "没有查到数据哦";
    }

    public RequestConfig getConfig() {
        RequestConfig config = RequestConfig.custom()
                .setConnectTimeout(10000)
                .setConnectionRequestTimeout(10000)
                .setSocketTimeout(10000)
                .build();
        return config;
    }




    //下载图片
    public String doGetImg(String url){

        //获取httpclient对象，设置url地址
        CloseableHttpClient httpClient = HttpClients.custom().setConnectionManager(this.cm).build();
        HttpGet httpGet = new HttpGet(url);
        //设置请求信息
        httpGet.setConfig(this.getConfig());
        //发起请求，获取响应
        CloseableHttpResponse response = null;
        try {
            response = httpClient.execute(httpGet);
            if (response.getStatusLine().getStatusCode()==200){
                if (response.getEntity()!=null){

                    //下载图片
                    //获取图片的后缀
                    String extName = url.substring(url.lastIndexOf("."));
                    //创建图片名
                    String picName = UUID.randomUUID().toString()+extName;
                    //下载图片
                    //返回图片的名称
                    OutputStream outputStream = new FileOutputStream(new File("C:\\Users\\old\\Desktop\\img\\"+picName));
                    response.getEntity().writeTo(outputStream);
                    return picName;


                }else {
                    return "没有查到数据";
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (response!=null){
                try {
                    response.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return "没有查到数据哦";
    }


}
