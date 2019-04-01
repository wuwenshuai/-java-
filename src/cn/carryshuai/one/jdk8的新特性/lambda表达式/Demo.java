package cn.carryshuai.one.jdk8的新特性.lambda表达式;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * lambda表达式入门
 */
public class Demo {


    @Test
    public void test1(){
        String[] atp = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka",
                "David Ferrer","Roger Federer",
                "Andy Murray","Tomas Berdych",
                "Juan Martin Del Potro"};
        List<String> list = Arrays.asList(atp);

        //使用foreach方式
        for (String string : list){
            System.out.println(string);
        }
        System.out.println("=====================================");
        //使用lambda表达式
        list.forEach((string)-> System.out.println(string));
    }
}
