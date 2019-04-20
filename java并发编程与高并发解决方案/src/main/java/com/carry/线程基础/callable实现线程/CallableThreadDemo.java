package com.carry.线程基础.callable实现线程;

import java.util.concurrent.FutureTask;

public class CallableThreadDemo {
    public static void main(String[] args) {

        FutureTask<Integer> futureTask = new FutureTask<>(() -> {

            System.out.println("------------");
            return 1;
        });
        new Thread(futureTask).start();
    }


}
