package com.carry.并发常见的设计模式.单例模式;


/**
 * 使用枚举创建单例设计模式
 */
public class EnumSingleClass {

    //私有化构造器
    private EnumSingleClass(){

    }
    //创建一个枚举类
    private enum SingleEnum{
        EnumSingleClassInstance;

        private  EnumSingleClass enumSingleClass;
        SingleEnum(){
            enumSingleClass = new EnumSingleClass();
        }
        public EnumSingleClass getInstance(){
            return enumSingleClass;
        }

    }
    //提供一个外部访问的静态方法
    public static EnumSingleClass getInstance(){
        return SingleEnum.EnumSingleClassInstance.getInstance();
    }

}
