package cn.carryshuai.one.设计模式.工厂.抽象工厂;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/9/13 09:39
 * @Description:
 */
public class GoodCarFactory implements CarFactory{
    @Override
    public Fadongji creatFadongji() {
        return new GoodFadongji();
    }

    @Override
    public Seat creatSeat() {
        return new GoodSeat();
    }
}
