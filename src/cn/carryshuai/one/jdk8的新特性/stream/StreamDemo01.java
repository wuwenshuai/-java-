package cn.carryshuai.one.jdk8的新特性.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * 输出对象
 */
public class StreamDemo01 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
       /* list.stream().forEach((name)->{
            System.out.println(name);
        });*/

        //筛选名字以张开头的，并且长度等于三的，最后输出
        list.stream().filter((name)->name.startsWith("张"))
                .filter((name)->name.length()==3)
                .forEach((name)-> System.out.println(name));
    }

}
