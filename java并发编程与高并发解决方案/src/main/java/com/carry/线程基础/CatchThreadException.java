package com.carry.线程基础;

/**
 * 捕获线程运行时期的异常
 */
public class CatchThreadException {

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int i = 1 / 0;
        });
        thread.setUncaughtExceptionHandler((t,e)->{
            System.out.println(e);
            System.out.println(t);
        });
        thread.start();
    }
}
