package com.carry.线程基础.读写锁;


import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 一个线程写入一百个线程读取
 */
public class RedWriteLockDemo {





    public static void main(String[] args) throws InterruptedException {

        ShareData shareData = new ShareData();
        new Thread(()->{
            shareData.put("put");
        },"write").start();

        Thread.sleep(1000);
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                shareData.read();
            },"read").start();
        }
    }
}


//资源类
class ShareData{
    private Object object ;

    //提供一个写的方法
    //读写锁
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();


    public void put(Object object){
        lock.writeLock().lock();
        try {
            this.object = object;
            System.out.println(Thread.currentThread().getName()+":"+object);
        }finally {
            lock.writeLock().unlock();
        }

    }

    //一个读方法
    public void read(){
        lock.readLock().lock();
        try {
            System.out.println(Thread.currentThread().getName()+":"+object);
        }finally {
            lock.readLock().unlock();
        }
    }
}
