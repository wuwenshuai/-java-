package com.carry.并发常见的设计模式.观察者模式.观察者案例2;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者对象：
 * 添加观察者，删除观察者，通知观察者对象的方法
 * 存放观察者的集合
 */
public class Subject {

    private List<Observer> observers = new ArrayList<>();

    //事件源，这个值改变就会发生改变
    private int state;
    //添加观察者
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    //改变state的值，通知观察者
    public void setState(int state) {
        if (state == this.state) {
            return;
        }
        this.state = state;
        notifyAllObserver();
    }

    //通知观察者
    private void notifyAllObserver() {
        observers.stream().forEach(Observer::update);
    }


}
