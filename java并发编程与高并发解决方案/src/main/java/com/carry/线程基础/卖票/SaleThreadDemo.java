package com.carry.线程基础.卖票;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SaleThreadDemo {

    public static void main(String[] args) {

        TickeSale tickeSale = new TickeSale();
        new Thread(()->{
            for (int i = 0; i < 40; i++) {
                tickeSale.sale();
            }
        },"A").start();

        new Thread(()->{
            for (int i = 0; i < 40; i++) {
                tickeSale.sale();
            }
        },"B").start();


        new Thread(()->{
            for (int i = 0; i < 40; i++) {
                tickeSale.sale();
            }
        },"C").start();

    }
}

//资源类

class TickeSale{
    //定义一个locak锁
  Lock lock = new ReentrantLock();
    private int ticketNum = 40;
    public void sale(){
        lock.lock();
        try {
            if (ticketNum>0){
                System.out.println("线程:"+Thread.currentThread().getName()+":卖出第:"+(ticketNum--)+"张票，还剩:"+ticketNum);
            }
        }finally {
            lock.unlock();
        }
    }

}
