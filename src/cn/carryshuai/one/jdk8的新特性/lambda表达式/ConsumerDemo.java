package cn.carryshuai.one.jdk8的新特性.lambda表达式;

import java.util.function.Consumer;

/**
 * java.util.function.Consumer<T> 接口则正好与Supplier接口相反，它不是生产一个数据，而是消费一个数据，
 * 其数据类型由泛型决定
 * Consumer 接口中包含抽象方法 void accept(T t) ，意为消费一个指定泛型的数据。基本使用如：
 */
public class ConsumerDemo {


    public static void method(String name,Consumer<String> consumer){
        consumer.accept(name);
    }
    public static void main(String[] args) {
        method("sbCarry",(name)->{
           // System.out.println(name);
            //进行字符串的反转
            String s = new StringBuilder(name).reverse().toString();
            System.out.println(s);
        });
    }
}
