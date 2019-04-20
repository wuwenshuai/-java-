package com.carry.线程基础.生产者消费者;


import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description: 现在两个线程，
 * 可以操作初始值为零的一个变量，
 * 实现一个线程对该变量加1，一个线程对该变量减1，
 * 交替，来10轮，变量初始值为零。
 * 1 多线程编写套路------上
 * 1.1	线程		操作(实例方法)		资源类
 * 1.2  高内聚  低耦合
 * 2 多线程编写套路------下
 * 2.1 判断
 * 2.2 干活
 * 2.3 通知
 */
public class NotifyAllAndAwaitDemo {

    public static void main(String[] args) {

        ShareData shareData = new ShareData();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    // shareData.increment();
                    shareData.incrementByLock();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "A").start();


        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    // shareData.increment();
                    shareData.incrementByLock();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "B").start();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    // shareData.decrement();
                    shareData.decrementByLock();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "C").start();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    // shareData.decrement();
                    shareData.decrementByLock();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "D").start();

    }


}


//资源类
class ShareData {

    //共享资源
    private int number;

    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    //实例方法
    public synchronized void increment() throws InterruptedException {

        //1判断
        while (number != 0) {
            this.wait();
        }
        //2干活
        number++;
        notifyAll();
        System.out.println(Thread.currentThread().getName() + ":" + number);

    }

    //实例方法
    public synchronized void decrement() throws InterruptedException {

        //1判断
        while (number == 0) {
            this.wait();
        }
        //2干活
        number--;
        notifyAll();
        System.out.println(Thread.currentThread().getName() + ":" + number);
    }


    //资源类(使用lock锁的方式)


    //实例方法
    public synchronized void incrementByLock() throws InterruptedException {

        lock.lock();
        try {
            //1判断
            while (number != 0) {
                condition.await();
            }
            //2干活
            number++;
            condition.signalAll();
            System.out.println(Thread.currentThread().getName() + ":" + number);
        } finally {
            lock.unlock();
        }


    }

    //实例方法
    public synchronized void decrementByLock() throws InterruptedException {
        lock.lock();
        try {
            //1判断
            while (number == 0) {
                condition.await();
            }
            //2干活
            number--;
            condition.signalAll();
            System.out.println(Thread.currentThread().getName() + ":" + number);
        } finally {
            lock.unlock();
        }


    }


}