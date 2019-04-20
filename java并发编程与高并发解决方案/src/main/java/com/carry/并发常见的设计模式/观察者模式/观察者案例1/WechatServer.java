package com.carry.并发常见的设计模式.观察者模式.观察者案例1;

import java.util.ArrayList;
import java.util.List;

/**
 * 定义一个被观察者对象，实现Observerable接口，同时有一个list集合，用以保存注册的观察者
 * 等需要通知观察者时，遍历该集合即可
 */
public class WechatServer implements Observerable{

    private List<Observer> list;
    private String message;

    public WechatServer() {
        list = new ArrayList<Observer>();
    }
    @Override
    public void registerObserver(Observer o) {

        list.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        list.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < list.size(); i++) {
            Observer observer = list.get(i);
            observer.update(message);
        }
    }

    //提供一个setmessage的方法
    public void setInfomation(String s) {
        this.message = s;
        System.out.println("微信服务更新消息： " + s);
        //消息更新，通知所有观察者
        notifyObserver();
    }

}
