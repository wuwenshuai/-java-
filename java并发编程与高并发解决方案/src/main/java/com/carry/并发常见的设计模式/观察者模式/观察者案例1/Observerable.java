package com.carry.并发常见的设计模式.观察者模式.观察者案例1;


/**
 * 定义一个抽象的被观察者接口
 */
public interface Observerable {

    /**
     * 抽象被观察者接口
     * 声明了添加，删除，通知观察者方法
     */
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();


}
