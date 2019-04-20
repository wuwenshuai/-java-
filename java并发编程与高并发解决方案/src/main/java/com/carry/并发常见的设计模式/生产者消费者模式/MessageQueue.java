package com.carry.并发常见的设计模式.生产者消费者模式;

import java.util.LinkedList;

public class MessageQueue {

    //存放消息的队列
   private LinkedList<Message> queue ;
    private final static int DEFAULT_MAX_LIMIT = 100;
    private final int limit;
   public MessageQueue(){
       this(DEFAULT_MAX_LIMIT);
   }
   public MessageQueue(final int limit){
       this.limit = limit;
       this.queue = new LinkedList<>();
   }

   //提供一个添加到队列的方法
    public void put(final Message message) throws InterruptedException {
        synchronized (queue) {
            while (queue.size() > limit) {
                queue.wait();
            }
            queue.addLast(message);
            queue.notifyAll();
        }
    }
    //提供一个从队列删除的方法
    public Message take() throws InterruptedException {
       synchronized (queue){
          while (queue.isEmpty()){
              queue.wait();
          }
           Message message = queue.removeFirst();
           queue.notifyAll();
           return message;
       }

    }
}
