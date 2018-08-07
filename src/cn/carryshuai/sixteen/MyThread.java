package cn.carryshuai.sixteen;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/8/1 10:31
 * @Description:
 */
public class MyThread extends Thread{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 20; i++) {
            System.out.println("线程的run-----");
        }

    }
    public static void main (String[] args){

        Thread thread1 = new MyThread();
        Thread thread2 = new MyThread();
        //注意：调用run和start方法的区别：直接调用run方法，不会开线程，都是在main线程中
        //thread1.run();
        //thread2.run();
        thread1.start();
        thread2.start();
    }

}
