package cn.carryshuai.one.抽象类;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/8/8 16:49
 * @Description:
 */
public class BocDockingService extends AbstractInterfaceApp{




    BocServic bocServic = new BocServic();


    @Override
    public String test1() {
        String test1 = bocServic.test1();
        return test1;
    }
}
