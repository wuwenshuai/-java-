package com.carry.并发常见的设计模式.单例模式;


/**
 * 静态内部类方式的单例模式
 */
public class StaticInnerSingleClass {

    //提供一个静态内部类
    private static class InstanceHandler{
        private  final static StaticInnerSingleClass staticInnerSingleClass = new StaticInnerSingleClass();
    }

    //私有化构造函数
    private StaticInnerSingleClass(){

    }
    //提供一个外部访问的方法
    public static StaticInnerSingleClass getInstanceStaticInnerSingleClass(){
        return InstanceHandler.staticInnerSingleClass;
    }
}
