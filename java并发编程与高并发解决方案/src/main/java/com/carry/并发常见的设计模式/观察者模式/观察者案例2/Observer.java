package com.carry.并发常见的设计模式.观察者模式.观察者案例2;

/**
 *观察者角色
 */
public abstract class Observer {

    private Subject subject;

    public abstract void update();
}
