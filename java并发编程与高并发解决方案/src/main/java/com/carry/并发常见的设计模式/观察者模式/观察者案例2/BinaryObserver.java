package com.carry.并发常见的设计模式.观察者模式.观察者案例2;

/**
 * 具体的观察者角色
 */
public class BinaryObserver extends Observer{


    @Override
    public void update() {
        System.out.println("二进制------------------");
    }
}
