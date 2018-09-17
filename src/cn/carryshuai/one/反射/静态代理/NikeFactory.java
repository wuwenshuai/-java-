package cn.carryshuai.one.反射.静态代理;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/8/31 18:55
 * @Description:
 */
public class NikeFactory implements ClothFactory{
    @Override
    public void product() {
        System.out.println("nike生产了");
    }
}
