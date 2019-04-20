package com.carry.并发常见的设计模式.观察者模式.观察者案例1;


/**
 * 定义一个抽象的观察者接口
 */
public interface Observer {


    /**
     * 抽象观察者，定义了一个update方法，当观察者调用notifyObserver会回调update方法
     */

    void update(String message);
}
