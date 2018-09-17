package cn.carryshuai.one.多线程.concurrent包;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/9/17 14:31
 * @Description:BlockingQueue
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> taskQueue = new ArrayBlockingQueue<>(100);
        WorkThread workThread = new WorkThread(taskQueue);
        workThread.start();
        //添加任务
        taskQueue.put("carry");
        Thread.sleep(1000);
        taskQueue.put("shuai");
        Thread.sleep(1000);
        workThread.interrupt();
        workThread.join();
        System.out.println("END");
    }
}

class WorkThread extends Thread {

    BlockingQueue<String> taskQueue;

    public WorkThread(BlockingQueue<String> taskQueue) {
        this.taskQueue = taskQueue;
    }

    @Override
    public void run() {
        while (!isInterrupted()) {
            //线程不中断
            String name;
            try {
                name = taskQueue.take();
            }catch (InterruptedException e){
                break;
            }
            String result = "Hello"+name+"!";
            System.out.println(result);
        }
    }
}
