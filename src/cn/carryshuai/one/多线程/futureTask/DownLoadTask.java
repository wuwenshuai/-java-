package cn.carryshuai.one.多线程.futureTask;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.*;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/9/17 15:17
 * @Description:
 */
public class DownLoadTask implements Callable<String> {
    String url;

    public DownLoadTask(String url) {
        this.url = url;
    }

    @Override
    public String call() throws Exception {
        System.out.println("开始下载-----");
        URLConnection connection = new URL(this.url).openConnection();
        connection.connect();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"))) {
            String s = null;
            StringBuilder sb = new StringBuilder();
            while ((s = reader.readLine()) != null) {
                sb.append(s).append("\n");
            }
            return sb.toString();
        }
    }
}


class Main{
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        DownLoadTask task = new DownLoadTask("https://www.sina.com.cn/");
        Future<String> future = executorService.submit(task);
        String html = future.get();
        System.out.println(html);
        //关闭线程池
        executorService.shutdown();
    }
}