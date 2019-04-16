package com.carry.并发常见的设计模式.单例模式;


/**
 * 双重锁机制的单例模式(强化懒汉式，变为线程安全的)
 */
public class TwoLockSingleClass {


    //提供一个静态的对象
    private static volatile TwoLockSingleClass twoLockSingleClass;

    //提供一个外部访问的方法
    public static TwoLockSingleClass getInstanceTwoLockSingleClass(){
        if (twoLockSingleClass == null){
            synchronized (TwoLockSingleClass.class){
                twoLockSingleClass = new TwoLockSingleClass();
            }
        }
        return TwoLockSingleClass.twoLockSingleClass;
    }
    //私有化构造函数
    private TwoLockSingleClass(){

    }


}
