package cn.carryshuai.one.设计模式.工厂.抽象工厂;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/9/13 09:38
 * @Description:
 */
public class LowCarFactory implements CarFactory{
    @Override
    public Fadongji creatFadongji() {
        return new LowFadongji();
    }

    @Override
    public Seat creatSeat() {
        return new LowSeat();
    }
}
