package cn.carryshuai.one.多线程.线程的中断;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/9/17 10:57
 * @Description:
 */
public class Demo {
    public static void main(String[] args) {
        ThreadDemo1 threadDemo1 = new ThreadDemo1();
        Thread thread = new Thread(threadDemo1,"carry");
        thread.start();

    }



}

class ThreadDemo1 implements Runnable{

    @Override
    public void run() {
        System.out.println("hahahhhah");
    }
}