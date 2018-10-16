package cn.carryshuai.one.多线程.concurrent包.卖票;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 资源类=属性+ 实例方法
 */
public class Ticket {

    private int number = 50;
    //卖票的实例方法
    private Lock lock = new ReentrantLock();
    public void seal(){
        //定义一个锁
        lock.lock();
        try {
            if (number>0){
                System.out.println(Thread.currentThread().getName()+"卖出第"+number--+":票   还剩:"+number);
            }
        }finally {
            //释放锁
            lock.unlock();
        }
    }
}
