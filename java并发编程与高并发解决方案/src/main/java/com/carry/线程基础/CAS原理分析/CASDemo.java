package com.carry.线程基础.CAS原理分析;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * 对一个变量进行累加
 */
public class CASDemo {

    int nummber =0;
    AtomicInteger atomicInteger = new AtomicInteger(0);

    public void add(){
        nummber++;
    }
    public void atomicAdd(){
        atomicInteger.getAndIncrement();
    }

    public static void main(String[] args) {


        ShareData shareData = new ShareData();
        for (int i = 0; i <20 ; i++) {
            new Thread(()->{
                for (int j = 0; j < 1000; j++) {
                   shareData.add();
                   shareData.atomicAdd();
                }
            },String.valueOf(i)).start();
        }
        while (Thread.activeCount()>2){
            Thread.yield(); //会使这个线程由正在运行的running状态转变为等待cpu时间片的runable状态。
        }
        System.out.println(shareData.nummber);  //结果小于等于20000
       System.out.println(shareData.atomicInteger.get()); //结果的每次都等于20000
    }
}
class ShareData{
    volatile int nummber =0;
    public void add(){
        nummber++;
    }

    AtomicInteger atomicInteger = new AtomicInteger(0);
    public void atomicAdd(){
        atomicInteger.getAndIncrement();
    }
}
