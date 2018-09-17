package cn.carryshuai.one.设计模式.工厂.抽象工厂;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/9/13 09:40
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        CarFactory factory = new GoodCarFactory();
        Fadongji fadongji = factory.creatFadongji();
        fadongji.run();

        CarFactory factory1 = new LowCarFactory();
        Fadongji fadongji1 = factory1.creatFadongji();
        fadongji1.run();



    }
}
