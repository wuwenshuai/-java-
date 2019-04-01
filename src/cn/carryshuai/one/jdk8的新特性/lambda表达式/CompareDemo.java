package cn.carryshuai.one.jdk8的新特性.lambda表达式;

import java.util.Arrays;
import java.util.Comparator;

public class CompareDemo {

    //当方法的返回值是一个函数式接口的时候，可以使用lambda表达式
    public static Comparator<String> getStringSort(){
      return  (o1,o2)->o2.length()-o1.length();
    }

    public static void main(String[] args) {
        String[] arry = {"qq","q","qqqq","qqq"};
        //调用字符串的比较函数
        Arrays.sort(arry,getStringSort());
        //输出排序后的字符串
        System.out.println(Arrays.toString(arry));
    }
}
