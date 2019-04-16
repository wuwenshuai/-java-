package com.carry.线程基础;

public class SaleThread implements Runnable{

    //定义一个票数
    public static final int MAX = 500;
    private int index = 1;
    @Override
    public void run() {

        while (true){
            synchronized (this){
                if (index>MAX){
                    break;
                }else {
                    try {
                        Thread.sleep(50);
                        System.out.println(Thread.currentThread() + " 的号码是:" + (index++));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        }
    }
}
