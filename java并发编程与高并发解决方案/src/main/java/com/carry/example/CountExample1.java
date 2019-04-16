package com.carry.example;


import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

@Slf4j
public class CountExample1 {

    //请求总数
    public static int clientTotal  = 5000;
    //同时执行的线程数
    public static int threadTotal = 200;
    //计数
    public static int count = 0;
    public static void main(String[] args) throws Exception {
        System.out.println("start");

        //创建一个线程池
        ExecutorService executorService = Executors.newCachedThreadPool();
        //定义信号量,给出允许并发的数目
        final Semaphore semaphore = new Semaphore(threadTotal);
        final CountDownLatch countDownLatch = new CountDownLatch(clientTotal);//定义计数器闭锁
        for (int i = 0; i < clientTotal; i++) {
            executorService.execute(()->{
                try {
                    semaphore.acquire();//判断进程是否允许被执行
                    add();
                    semaphore.release();//释放线程
                }catch (Exception e){
                    log.error("excption",e);
                }
                countDownLatch.countDown();
            });
        }
        countDownLatch.await();//保证信号量减为0
        executorService.shutdown();//关闭线程池
        System.out.println("end");
        log.info("count:{}",count);


    }
    private static void add(){
        count++;
    }
}
