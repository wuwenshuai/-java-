package com.carry.线程基础;

public class SaleDemo {

    public static void main(String[] args) {
        SaleThread saleThread = new SaleThread();

        Thread thread1 = new Thread(saleThread, "一号窗口");
        Thread thread2 = new Thread(saleThread, "二号窗口");
        Thread thread3 = new Thread(saleThread, "三号窗口");

        thread1.start();
        thread2.start();
        thread3.start();

    }
}
