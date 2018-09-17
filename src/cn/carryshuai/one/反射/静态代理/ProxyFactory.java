package cn.carryshuai.one.反射.静态代理;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/8/31 18:55
 * @Description:
 */
public class ProxyFactory implements ClothFactory{

    private NikeFactory nikeFactory;

    public ProxyFactory(NikeFactory nikeFactory) {
        this.nikeFactory = nikeFactory;
    }

    @Override
    public void product() {
        System.out.println("前置操作");
        nikeFactory.product();
        System.out.println("后置操作");

    }
}
