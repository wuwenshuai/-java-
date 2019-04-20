package com.carry.并发常见的设计模式.观察者模式.观察者案例1;


/**
 * 定义具体观察者,实现observer方法
 */
public class User implements Observer{

    private String name;
    private String message;
    public User(String name) {
        this.name = name;
    }
    @Override
    public void update(String message) {
        this.message = message;
        read();
    }
    public void read() {
        System.out.println(name + " 收到推送消息： " + message);
    }
}
