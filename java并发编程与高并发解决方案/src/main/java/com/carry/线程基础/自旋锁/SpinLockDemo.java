package com.carry.线程基础.自旋锁;


import java.util.concurrent.atomic.AtomicReference;

/**
 * 题目：实现一个自旋锁:获取锁的线程不会立即阻塞，而是采用循环的方式获取锁
 * 好处：循环比较获取，直到成功为止，没有类似wait的等待
 * 通过CAS完成自旋锁，A线程先调用myLock方法，自己持有锁五秒钟，b线程进来发现当前线程有锁，只能线程等待，直到A
 * 释放后，B随即抢到
 */
public class SpinLockDemo {

    //原子引用线程
    AtomicReference<Thread> atomicReference = new AtomicReference<>();

    public void myLock(){
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName()+"lock come in");
        while (!atomicReference.compareAndSet(null,thread)){

        }
    }
    public void myUnlock(){
        Thread thread = Thread.currentThread();
        atomicReference.compareAndSet(thread,null);
        System.out.println(thread.getName()+"unlock come in");
    }

    public static void main(String[] args) throws InterruptedException {

        SpinLockDemo spinLockDemo = new SpinLockDemo();

        new Thread(()->{
            spinLockDemo.myLock();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            spinLockDemo.myUnlock();
        },"AA").start();

        Thread.sleep(1000);
        new Thread(()->{
            spinLockDemo.myLock();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            spinLockDemo.myUnlock();
        },"BB").start();

    }
}
