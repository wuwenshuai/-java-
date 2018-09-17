package cn.carryshuai.one.多线程.futureTask;

import java.util.concurrent.*;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/9/12 16:18
 * @Description:
 */
public class TestDemo1 {


    public static void main(String[] args) {
        //第一种方式
        ExecutorService executor = Executors.newCachedThreadPool();
        Task task = new Task();
        FutureTask<Integer> futureTask = new FutureTask<Integer>(task);
        executor.submit(futureTask);
        executor.shutdown();
        try {
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("main--------");
        try {
            System.out.println("task运行结果"+futureTask.get());
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("over");
    }
}


class Task implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        System.out.println("子线程在进行计算");
        Thread.sleep(3000);
        int sum = 0;
        for(int i=0;i<100;i++)
            sum += i;
        return sum;
    }
}
