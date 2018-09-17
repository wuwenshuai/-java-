package cn.carryshuai.one.多线程.concurrent包;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/9/17 13:54
 * @Description:
 */
public class Demo {
    public static void main(String[] args) throws Exception {
        Counter counter = new Counter();
        Thread thread2 = new Thread(){
            public void run() {
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (int i =0; i<1000;i++){
                    counter.add();
                }
            }
        };
        Thread thread1 = new Thread(){
            public void run() {
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (int i =0; i<1000;i++){
                    counter.dec();
                }
            }
        };

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(counter.getValue());
    }
}


/**
 * 对account加一和减一操作
 * */
class Counter{

    private int value = 0;

    //获得锁
  // private   Lock lock = new ReentrantLock();
   ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
   Lock readLock = readWriteLock.readLock();//用于读取锁
   Lock writeLock = readWriteLock.writeLock();//用于写入锁

    public void add(){
        writeLock.lock();
        try {
            this.value +=1;
        }finally {
            writeLock.unlock();
        }

    }
    public void dec(){
        writeLock.lock();
        try {
            this.value -=1;
        }finally {
            writeLock.unlock();
        }

    }
    public int getValue(){
        readLock.lock();
        try {
            return this.value;
        }finally {
            readLock.unlock();
        }

    }

}