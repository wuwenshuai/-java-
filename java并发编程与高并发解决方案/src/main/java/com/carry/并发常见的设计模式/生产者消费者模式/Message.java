package com.carry.并发常见的设计模式.生产者消费者模式;

public class Message {

    private String data;

    public Message(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
}
