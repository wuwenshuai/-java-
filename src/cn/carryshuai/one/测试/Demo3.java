package cn.carryshuai.one.测试;

import cn.carryshuai.one.注解.Test;

public class Demo3 {
    public static void main(String[] args) {
        Test1 ex = new Test1();
        ex.change(ex.str,ex.ch);
        System.out.println(ex.str+" and");
        System.out.println(ex.ch);


        char[] arr = new char[]{'a','b','c'};
        System.out.println(arr);//

        int[] arr1 = new int[]{1,2,3};
        System.out.println(arr1);//

        double[] arr2 = new double[]{1.1,2.2,3.3};
        System.out.println(arr2);//

    }
}

class Test1{
    String str = new String("good");
    char[] ch ={'t','e','s','t'};
    public void change(String str,char ch[]){
        str = "test ok";
        ch[0] = 'g';
    }
}
