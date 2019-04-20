package com.carry.并发常见的设计模式.chapter8;

/***************************************
 * @author:Alex Wang
 * @Date:2017/3/22 QQ:532500648
 * QQ交流群:286081824
 ***************************************/
public interface Future<T> {

    T get() throws InterruptedException;

}