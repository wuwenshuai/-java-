package com.carry.JUC.Atomitic案例;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class Demo1 {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(1);
        boolean b = atomicInteger.compareAndSet(1, 10);
        System.out.println(atomicInteger.get());
        System.out.println(b);

    }
}
