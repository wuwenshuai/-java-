package com.carry.并发常见的设计模式.单例模式;


/**
 * 懒汉式
 */
public class LazySingleClass {

    private static  LazySingleClass lazySingleClass = null;

    //提供一个创建对象的方法
    public static LazySingleClass instanceLazySingleClass(){
        if (lazySingleClass == null){
            lazySingleClass = new LazySingleClass();
        }
        return lazySingleClass;
    }

    //私有化构造函数
    private LazySingleClass(){

    }
    //
}
