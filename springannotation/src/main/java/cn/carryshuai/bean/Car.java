package cn.carryshuai.bean;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/9/19 09:28
 * @Description:
 */
public class Car {
    public Car() {
        System.out.println("创建完成-------");
    }
    public void init(){
        System.out.println("init");
    }
    public void destory(){
        System.out.println("destory");
    }
}
