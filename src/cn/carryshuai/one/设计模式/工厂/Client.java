package cn.carryshuai.one.设计模式.工厂;

import cn.carryshuai.one.设计模式.工厂.工厂方法.AodiFactory;
import cn.carryshuai.one.设计模式.工厂.简单工厂.SimpleFactory;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/9/12 09:38
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        CarInterface aodi = SimpleFactory.getCardFactory("aodi");
        CarInterface dazhong = SimpleFactory.getCardFactory("dazhong");
        aodi.run();
        dazhong.run();
        System.out.println("====================工厂方法模式==============");
        CarInterface aodi1 = new AodiFactory().getcard();
        aodi1.run();
        System.out.println("====================抽象工厂模式==============");
    }
}
