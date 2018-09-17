package cn.carryshuai.one.设计模式.工厂.建造者;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/9/14 09:57
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        AirShipDirector director = new CarryAirShipDirector(new CarryAirShipBuilder());
        AirShip ship = director.directAirShip();
        System.out.println(ship.getEngine().getName());
        System.out.println(ship.getEscapeTower().getName());
    }
}
