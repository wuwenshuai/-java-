package cn.carryshuai.one.遍历map.利用map做缓存;

public class Demo {

    public static void main(String[] args) {
        CacheMap cacheMap = new CacheMap();
        CacheMap.cacheMap.put("carry","hehhe");
        Demo demo = new Demo();
       demo.test();


    }

    public void test(){
        String carry = CacheMap.getCacheMap().get("carry");
        System.out.println(carry);
    }
}
