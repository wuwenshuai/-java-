package cn.carryshuai.one.多线程.join;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/9/17 10:39
 * @Description:
 */
public class Demo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main");
        ThreadDemo1 threadDemo1 = new ThreadDemo1();
        threadDemo1.start();
        //join让当前线程执行完成后，才接着向下执行
        threadDemo1.join();
        System.out.println("test");
    }
}

class  ThreadDemo1 extends Thread{
    @Override
    public void run() {
        for (int i =0;i<10;i++){
            System.out.println("hello");
        }

    }
}
