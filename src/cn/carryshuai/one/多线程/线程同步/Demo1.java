package cn.carryshuai.one.多线程.线程同步;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/9/17 11:19
 * @Description:
 */

/**
 * 两个线程实现对一个数的加一和减一操作
 */
public class Demo1 {
    public static int LOOP = 1000;
    public static int count = 0;

    public static Object objlock = new Object();
    public static void main(String[] args) throws InterruptedException {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        thread1.start();
       // thread1.join();
        thread2.start();
        System.out.println(count);
    }
}

class Thread1 extends Thread{
    @Override
    public void run() {

        synchronized (Demo1.objlock){
            for (int i = 0;i<Demo1.LOOP;i++){
                Demo1.count -=1;
            }
        }

    }
}


class Thread2 extends Thread{
    @Override
    public void run() {
        synchronized (Demo1.objlock){
            for (int i = 0;i<Demo1.LOOP;i++){
                Demo1.count +=1;
            }
        }

    }
}