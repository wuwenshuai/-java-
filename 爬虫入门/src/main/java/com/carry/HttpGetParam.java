package com.carry;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URISyntaxException;

/**
 * 带参数的htt pget
 */
public class HttpGetParam {

    public static void main(String[] args) throws URISyntaxException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        URIBuilder uriBuilder = new URIBuilder("http://yun.itheima.com/course");
        //设置参数
        uriBuilder.setParameter("keys","Java");
        HttpGet httpGet = new HttpGet(uriBuilder.build());
        CloseableHttpResponse response = null;
        try {
            response = httpClient.execute(httpGet);
            if (response.getStatusLine().getStatusCode()==200){
                HttpEntity entity = response.getEntity();
                String string = EntityUtils.toString(entity, "utf-8");
                System.out.println(string);
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

    }
}
