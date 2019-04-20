package com.carry.并发常见的设计模式.观察者模式.观察者案例2;

/**
 * 具体观察者对象
 */
public class OctalObserver extends Observer{
    @Override
    public void update() {
        System.out.println("八进制数据更新了------------------");
    }
}
