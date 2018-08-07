package cn.carryshuai.sixteen;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/8/1 11:10
 * @Description: Synchronized的使用
 */
public class SynchronizedDemo {


    public static void main (String[] args){


        Object object1 = new Object();
        Object object2 = new Object();
        new Thread("thread1"){
            @Override
            public void run() {
                synchronized (object1){
                    System.out.println(this.getName()+" start");
                    try {
                        //发生异常会jvm会释放锁
                        int i = 1/0;
                        Thread.sleep(3000);
                        System.out.println(this.getName()+"   醒了");
                        System.out.println(this.getName()+"   end");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
        new Thread("thread2"){
            @Override
            public void run() {
                synchronized (object1){
                    System.out.println(this.getName()+"   end");
                }
            }
        }.start();

    }
}
