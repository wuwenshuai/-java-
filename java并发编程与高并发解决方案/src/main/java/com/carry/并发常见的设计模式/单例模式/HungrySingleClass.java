package com.carry.并发常见的设计模式.单例模式;


import sun.security.jca.GetInstance;

/**
 * 饿汉式
 */
public class HungrySingleClass {

    //私有化构造函数
    private HungrySingleClass(){

    }
    //提供一个对象实例
    private static  final HungrySingleClass hungrySingleClass = new HungrySingleClass();

    //提供一个静态的访问方法
    public static HungrySingleClass GetInstanceHungrySingleClass(){
        return hungrySingleClass;
    }
}
