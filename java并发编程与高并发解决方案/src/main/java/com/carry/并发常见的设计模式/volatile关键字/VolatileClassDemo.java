package com.carry.并发常见的设计模式.volatile关键字;


/**
 * volatile的可见性
 */
public class VolatileClassDemo {

    private final static int MAX_NUM = 50;
    private static volatile int cache_num = 0;

    public static void main(String[] args) {

        //第一个线程,s输出本地缓存变量
        new Thread(()->{
            int local_num = cache_num;
            while (local_num<MAX_NUM){
                if (local_num!=cache_num){
                    System.out.printf("The value updated to [%d]\n", cache_num);
                    local_num = cache_num;
                }
            }
        },"out").start();

        //另外一个线程
        new Thread(()->{
            int local_num = cache_num;
            while (cache_num<MAX_NUM){
                if (local_num!=MAX_NUM){
                    System.out.printf("Update the value to [%d]\n", ++local_num);
                    cache_num = local_num;
                }
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"add").start();

    }
}
