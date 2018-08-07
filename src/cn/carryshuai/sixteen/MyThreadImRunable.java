package cn.carryshuai.sixteen;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/8/1 10:45
 * @Description:
 */
public class MyThreadImRunable implements Runnable{

    private String name;

    public MyThreadImRunable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"-----run被调用了"+"-------"+this.name);
        }
    }


    public static void main (String[] args){
        Thread thread1 = new Thread(new MyThreadImRunable("thread1"),"a");
        Thread thread2 = new Thread(new MyThreadImRunable("thread2"),"b");
        thread1.start();
        thread2.start();

    }
}
