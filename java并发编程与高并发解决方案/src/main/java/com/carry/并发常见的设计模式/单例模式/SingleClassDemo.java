package com.carry.并发常见的设计模式.单例模式;


import java.util.stream.IntStream;

public class SingleClassDemo {

    public static void main(String[] args) throws InterruptedException {

        LazySingleClass  lazySingleClass = LazySingleClass.instanceLazySingleClass();
        LazySingleClass lazySingleClass1 = LazySingleClass.instanceLazySingleClass();
        System.out.println(lazySingleClass);
        System.out.println(lazySingleClass1);

        System.out.println("================");

        HungrySingleClass hungrySingleClass = HungrySingleClass.GetInstanceHungrySingleClass();
        HungrySingleClass hungrySingleClass1 = HungrySingleClass.GetInstanceHungrySingleClass();
        System.out.println(hungrySingleClass1==hungrySingleClass);


        System.out.println("================");
        System.out.println(TwoLockSingleClass.getInstanceTwoLockSingleClass()==TwoLockSingleClass.getInstanceTwoLockSingleClass());


        System.out.println("============================");
        System.out.println(StaticInnerSingleClass.getInstanceStaticInnerSingleClass()==StaticInnerSingleClass.getInstanceStaticInnerSingleClass());

        System.out.println("================================");
        System.out.println(EnumSingleClass.getInstance()==EnumSingleClass.getInstance());


        //提供100线程
       /* IntStream.rangeClosed(1,100).forEach(i->new Thread(){
            @Override
            public void run() {
                System.out.println(EnumSingleClass.getInstance()==EnumSingleClass.getInstance());
            }
        }.start());*/


        //提供100线程
        IntStream.rangeClosed(1,300).forEach(i->new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(LazySingleClass.instanceLazySingleClass()==LazySingleClass.instanceLazySingleClass());
            }

        }.start());

    }

}
