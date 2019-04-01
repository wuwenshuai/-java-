package cn.carryshuai.one.jdk8的新特性.lambda表达式;

import org.junit.Test;

public class DemoTest{


    public static void showLog(int level,MessageBuilder messageBuilder){
        if (level == 1){
            System.out.println(messageBuilder.msgBuilder());
        }
    }


    public static void main(String[] args) {
     //  new Thread(()-> System.out.println("1111")).start();

        String msg1 = "hello";
        String msg2 = "carry";

        //调用showLog
        showLog(1,()->{
            return msg1+msg2;
        });

    }


    @Test
    public void test01(){
        //测试函数式编程接口作为参数
        //开启线程
        startThread(()->{
            System.out.println(Thread.currentThread().getName()+"-->"+"线程启动了");
        });
        //优化lambda表达式
        startThread(()-> System.out.println(Thread.currentThread().getName()+"-->"+"线程启动了"));


    }
    public void startThread(Runnable runnable){
       //开启线程
        new Thread(runnable).start();
    }
}
