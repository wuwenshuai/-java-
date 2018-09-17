package cn.carryshuai.one.设计模式.工厂.抽象工厂;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/9/13 09:33
 * @Description:
 */
public interface Fadongji {
    void run();
}
class GoodFadongji implements  Fadongji{

    @Override
    public void run() {
        System.out.println("好发动机");
    }
}

class LowFadongji implements  Fadongji{

    @Override
    public void run() {
        System.out.println("菜发动机");
    }
}
