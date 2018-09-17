package cn.carryshuai.one.测试;

import org.junit.Test;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/9/5 13:24
 * @Description:
 */
public class Demo2 {


    @Test
    public void test1(){
        System.out.println(get());
    }
    public int get(){
        return 2>1?3:4;
    }
}
