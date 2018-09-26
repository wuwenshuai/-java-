package cn.carryshuai.one.设计模式.策略模式;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/9/26 09:34
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        StagePrice oldCustomer = new OldCustomer();
        Content content = new Content(oldCustomer);
        content.printPrice(100.00);

        StagePrice newCustomer = new NewCustomer();
        Content newcon = new Content(newCustomer);
        newcon.printPrice(100.00);
    }
}
