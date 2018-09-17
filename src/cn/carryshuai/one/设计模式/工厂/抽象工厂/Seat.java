package cn.carryshuai.one.设计模式.工厂.抽象工厂;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/9/13 09:34
 * @Description:
 */
public interface Seat {
    void seatDown();
}
class GoodSeat implements Seat{

    @Override
    public void seatDown() {
        System.out.println("好座椅");
    }
}
class LowSeat implements Seat{

    @Override
    public void seatDown() {
        System.out.println("菜座椅");
    }
}
