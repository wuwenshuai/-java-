package com.carry.并发常见的设计模式.ThreadLocal理解;


/**
 * threadlocal的入门：获取每个线程的threadlocal的值
 */
public class ThreadLocalDemo1 {

    private static final ThreadLocal<String> threadLocal = new ThreadLocal<String>(){
        @Override
        protected String initialValue() {
            return "main nott value";
        }
    };
    public static void main(String[] args) throws InterruptedException {

        //创建两个线程
       Thread t1 =  new Thread(()->{
            //设置threadlocal值
            threadLocal.set("thread-01");
            //睡眠
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName()+":的threadlocal:"+threadLocal.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"thread-01");

        Thread t2 =  new Thread(()->{
            //设置threadlocal值
            threadLocal.set("thread-02");
            //睡眠
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName()+":的threadlocal:"+threadLocal.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"thread-02");

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("main:"+threadLocal.get());

    }
}
