package cn.carryshuai.one.抽象类;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/8/8 16:43
 * @Description:
 */
public class BocDockingController {





    public static void main(String[] args) {
        //声明abstractInterfaceApp

        AbstractInterfaceApp abstractInterfaceApp = new BocDockingService();
        String test1 = abstractInterfaceApp.test1();
        System.out.println(test1);
    }



}
