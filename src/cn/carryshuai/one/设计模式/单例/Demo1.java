package cn.carryshuai.one.设计模式.单例;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/9/7 09:27
 * @Description:
 */

/**
 * 饿汉式：线程安全，但是没有用synchronized修饰，一上来就创建好对象了
 * 懒汉式：线程安全，但是用synchronized修饰了
 */
public class Demo1 {

    public static void main(String[] args) {


        //饿汉式
        SingloeHungerClass instance1 = SingloeHungerClass.getSingloeClassInstance();
        SingloeHungerClass instance2 = SingloeHungerClass.getSingloeClassInstance();
        System.out.println(instance1==instance2);
        System.out.println(instance1.equals(instance2));


        //懒汉式
        SingloeLazyClass singloeLazyClass1 = SingloeLazyClass.getSingloeClassInstance();
        SingloeLazyClass singloeLazyClass2 = SingloeLazyClass.getSingloeClassInstance();
        System.out.println(singloeLazyClass1==singloeLazyClass2);

        System.out.println("----------------------------------------------");

        //双重锁
        SingleTwoLock singleTwoLock1 = SingleTwoLock.getInstance();
        SingleTwoLock singleTwoLock2 = SingleTwoLock.getInstance();
        System.out.println(singleTwoLock1==singleTwoLock2);


        //静态内部类

        SingleStaticInerClass singleStaticInerClass1 = SingleStaticInerClass.getInstance();
        SingleStaticInerClass singleStaticInerClass2 = SingleStaticInerClass.getInstance();
        System.out.println(singleStaticInerClass1==singleStaticInerClass2);

    }
}

class SingloeHungerClass{
    private static SingloeHungerClass singloeClass = new SingloeHungerClass();
    //私有化构造器
    private SingloeHungerClass(){

    }
    //提供一个方法去获得该对象
    public static SingloeHungerClass getSingloeClassInstance(){
        //静态方法只能访问类的静态成员
        return singloeClass;
    }
}


class SingloeLazyClass{

    private static SingloeLazyClass singloeLazyClass = null;
    //私有化构造器
    private SingloeLazyClass(){

    }
    //提供一个获取对象的方法
    public static synchronized SingloeLazyClass getSingloeClassInstance(){
        if (singloeLazyClass==null){
           singloeLazyClass = new SingloeLazyClass();
        }
        return singloeLazyClass;
    }
}


