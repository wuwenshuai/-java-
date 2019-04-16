package com.carry.线程基础;

public class ProdectAndConsumerDemo {


    public static void main(String[] args) {

        ProductAndConsumer pc = new ProductAndConsumer();

        new Thread(()->{
            //调用消费的方法
            while (true){
                pc.product();
            }
        },"p").start();
        new Thread(()->{
            //调用消费的方法
            while (true){
                pc.consumer();
            }
        },"c").start();
    }
}
