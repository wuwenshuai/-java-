package cn.carryshuai.one.多线程.创建线程;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/9/17 18:03
 * @Description:
 * 创建两个线程，一个计算1-100偶数相加，另一个计算1-100奇数相加
 */
public class Demo {

    private static int  sum = 0;

    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        thread1.start();
        Thread2 thread2 = new Thread2();
        thread2.start();
    }
}


class Thread1 extends Thread{
    int sum = 0;
    @Override
    public void run() {
        for (int i =0;i<100;i++){
            if (i%2==0){
                continue;
            }else {
                sum = sum+i;
            }
        }
        System.out.println(sum);
    }
}
class Thread2 extends Thread{
    int sum = 0;
    @Override
    public void run() {
        for (int i =0;i<100;i++){
            if (i%2==0){
                sum = sum+i;
            }else {
                continue;
            }
        }
        System.out.println(sum);
    }
}
