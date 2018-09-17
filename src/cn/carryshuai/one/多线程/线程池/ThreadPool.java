package cn.carryshuai.one.多线程.线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/9/17 14:57
 * @Description:
 */
public class ThreadPool {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        executor.submit(new PrintTask("Bob"));
        executor.submit(new PrintTask("Tom"));
        executor.submit(new PrintTask("Carry"));
        executor.submit(new PrintTask("Tony"));
        Thread.sleep(1000);
        executor.shutdown();

    }
}


class PrintTask implements Runnable{
    String name;

    public PrintTask(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i =0;i<3;i++){
            System.out.println("hello"+name+"!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
