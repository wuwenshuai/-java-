package cn.carryshuai.one.设计模式.单例;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/9/11 09:15
 * @Description:双重锁方式：由于jvm结构的原因，可能会有问题
 */
public class SingleTwoLock {
    private static SingleTwoLock singleTwoLock = null;

    //私有化构造器
    private SingleTwoLock(){

    }
    public static SingleTwoLock getInstance(){

        if (singleTwoLock == null){
            SingleTwoLock st ;
            synchronized (SingleTwoLock.class){
                st = singleTwoLock;
                if (st == null){
                    st = new SingleTwoLock();
                }
            }
            singleTwoLock = st;
        }
        return singleTwoLock;

    }
}
