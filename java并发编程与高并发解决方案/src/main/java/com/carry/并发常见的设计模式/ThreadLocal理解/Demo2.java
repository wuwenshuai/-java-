package com.carry.并发常见的设计模式.ThreadLocal理解;

import java.util.stream.IntStream;

public class Demo2 {

    public static void main(String[] args) {

        IntStream.rangeClosed(1,5).forEach((i)->{
            new Thread(new ExecutionTask()).start();
        });
    }
}
