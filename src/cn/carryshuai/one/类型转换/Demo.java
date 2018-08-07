package cn.carryshuai.one.类型转换;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/8/7 10:22
 * @Description:
 */
public class Demo {


    /**
     * 将整型强转为字节数组
     */
    @Test
    public void int2Bytes(){

        //隐式转换，自动转换，升格：班长-->排长

        //显示转换，强制转换，降格：排长-->班长

        int i = 4;
        byte[] arr = new byte[4];
        arr[0] =(byte)i;
        arr[1] =(byte)(i>>8);
        arr[2] =(byte)(i>>16);
        arr[3] =(byte)(i>>24);

        String s = Arrays.toString(arr);
        System.out.println(s);


    }
}
