package com.carry.线程基础;

public class ProductAndConsumer{

    boolean isProduct = false;
    private  int index = 0;

    public static final Object LOCK = new Object();

    //定义一个生产的方法
    public void product(){
        synchronized (LOCK){
            //判读是否生产数据了1
            if (isProduct){
                //有数据，需要等待
                try {
                    LOCK.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else {
                //生产数据
                System.out.println("p->"+index++);
                LOCK.notifyAll();
                isProduct = true;
            }
        }
    }

    //定义一个消费的方法
    public void consumer(){
        synchronized (LOCK){
            if (isProduct){
                //消费数据
                System.out.println("c->"+index);
                //已经消费了数据
                isProduct = false;
                LOCK.notify();
            }else {
                try {
                    LOCK.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
