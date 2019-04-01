package cn.carryshuai.one.jdk8的新特性.stream;

import java.util.stream.Stream;

/**
 * Stream流中的 map 方法基本使用的代码如：将A类性转为b类型
 */

public class StreamDemo02 {

    public static void main(String[] args) {
        Stream<String> original = Stream.of("10", "12", "18");
        original.map((String name)->{
            return Integer.parseInt(name);
        }).forEach((Integer i)->{
            System.out.println(i);
        });
    }
}
