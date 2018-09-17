package cn.carryshuai.one.设计模式.工厂.建造者;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/9/14 09:52
 * @Description:组装飞船
 */
public class CarryAirShipDirector implements  AirShipDirector{
    private AirShipBuilder builder;

    public CarryAirShipDirector(AirShipBuilder builder) {
        this.builder = builder;
    }

    @Override
    public AirShip directAirShip() {
        Engine engine = builder.builderEngine();
        EscapeTower escapeTower = builder.builderEscapeTower();
        //组装飞船对象
        AirShip ship = new AirShip();
        ship.setEngine(engine);
        ship.setEscapeTower(escapeTower);
        return ship;
    }
}
