package com.carry.并发常见的设计模式.生产者消费者模式;

public class ConsumerThread  extends Thread{

    private MessageQueue messageQueue;

    public ConsumerThread(MessageQueue messageQueue,int seq){
        super("Consumer-" + seq);
        this.messageQueue = messageQueue;
    }

    @Override
    public void run() {
        while (true){
            try {
                Message message = messageQueue.take();
                System.out.println(Thread.currentThread().getName() + " take a message " + message.getData());
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
            }
        }

    }
}
