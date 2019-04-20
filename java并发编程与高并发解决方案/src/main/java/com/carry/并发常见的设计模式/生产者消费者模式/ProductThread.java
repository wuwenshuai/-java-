package com.carry.并发常见的设计模式.生产者消费者模式;


import java.util.concurrent.atomic.AtomicInteger;

/**
 * 生产者线程
 */
public class ProductThread extends Thread{

    //消息队列
    private final MessageQueue messageQueue;
    private final static AtomicInteger atomicInteger = new AtomicInteger(0);

    //
    public ProductThread(MessageQueue messageQueue, int seq) {
        super("PRODUCER-" + seq);
        this.messageQueue = messageQueue;
    }

    @Override
    public void run() {
        Message message = new Message("Message-"+atomicInteger.incrementAndGet());
        try {
            messageQueue.put(message);
            System.out.println(Thread.currentThread().getName() + " put message " + message.getData());
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
