package cn.carryshuai.one.设计模式.工厂.建造者;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/9/14 09:34
 * @Description:
 */
public class AirShip {
    private Engine engine;
    private  EscapeTower escapeTower;

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setEscapeTower(EscapeTower escapeTower) {
        this.escapeTower = escapeTower;
    }

    public Engine getEngine() {
        return engine;
    }

    public EscapeTower getEscapeTower() {
        return escapeTower;
    }
}

class Engine {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public Engine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class EscapeTower{
    private String name;

    public EscapeTower(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
