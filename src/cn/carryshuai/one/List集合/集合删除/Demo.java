package cn.carryshuai.one.List集合.集合删除;

import cn.carryshuai.one.注解.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo {
        /**
         * 需求：存入集合，删除 def 和包含c的元素
         */


        @org.junit.Test
        public void test0(){
            List<String> allList = new ArrayList<>();
            allList.add("def");
            allList.add("2ccc");
            allList.add("3ddd");
            allList.add("hdc");
            allList.add("yeee");
            allList.add("yeee");
            allList.add("yeee");
            for (String  string: allList){
                if(string.contains("c")||string.equals("def")){
                   allList.remove(string);
                }
            }
            System.out.println(allList.size());

        }
        @org.junit.Test
        public void test1(){
        List<String> allList = new ArrayList<>();
        allList.add("def");
        allList.add("2ccc");
        allList.add("3ddd");
        allList.add("hdc");
        allList.add("yeee");
        allList.add("yeee");
        allList.add("yeee");
        //需要保留的集合
        List<String> needList = new ArrayList<>();
        //遍历所有集合
        for (String  string: allList){
            if (!string.contains("c") && !string.equals("def")){
                needList.add(string);
            }
        }
        System.out.println(needList.size());
    }

    @org.junit.Test
    public void test2(){
        List<String> allList = new ArrayList<>();
        allList.add("def");
        allList.add("2ccc");
        allList.add("3ddd");
        allList.add("hdc");
        allList.add("yeee");
        allList.add("yeee");
        allList.add("yeee");

        Iterator<String> it = allList.iterator();
        while(it.hasNext()){
            String x = it.next();
            if(x.contains("c")||x.equals("def")){
                it.remove();
            }
        }
        System.out.println(allList.size());
    }

}
