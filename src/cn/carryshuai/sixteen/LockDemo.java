package cn.carryshuai.sixteen;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/8/1 12:47
 * @Description:
 */
public class LockDemo {

    public static void main (String[] args){

        Lock lock = new ReentrantLock();

        new Thread(){
            @Override
            public void run() {
                lock.lock();
                try {
                    System.out.println(Thread.currentThread().getName()+"  得到锁");
                    for (int i = 0; i < 10; i++) {

                        System.out.println(Thread.currentThread().getName()+"         "+i);
                    }
                }catch (Exception e){

                }finally {
                    //释放锁(解锁)
                    lock.unlock();
                    System.out.println(Thread.currentThread().getName()+"   释放锁");
                }

            }
        }.start();
        new Thread() {
            public void run() {
                Thread thread = Thread.currentThread();
                lock.lock();
                try {
                    System.out.println(thread.getName() + "得到了锁");
                    for (int i = 0; i < 5; i++) {
                        System.out.println(Thread.currentThread().getName()+"         "+i);
                    }
                } catch (Exception e) {
                    // TODO: handle exception
                } finally {
                    System.out.println(thread.getName() + "释放了锁");
                    lock.unlock();
                }

            };
        }.start();
    }


}
