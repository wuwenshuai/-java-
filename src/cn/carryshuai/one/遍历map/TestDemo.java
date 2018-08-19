package cn.carryshuai.one.遍历map;

import org.junit.Test;

import java.util.*;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/8/15 17:39
 * @Description:
 */
public class TestDemo {

    /**
     * 遍历map的第一种方法：通过map.keySet转为set集合，遍历key和value
     */

    @Test
    public void test1() {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "ab");
        map.put(4, "ab");
        map.put(4, "ab");

        Set<Integer> integers = map.keySet();
        for (Integer key : integers){
            System.out.println(map.get(key));
        }

    }


    /**
     * （常用的方法）第二种方法：map.entrySet(),利用entrySet遍历key和value
     *
     */
    @Test
    public void test(){

        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "ab");
        map.put(4, "ab");
        map.put(4, "ab");
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry : entries){
            System.out.println("key:"+entry.getKey()+"----- value:"+entry.getValue());
        }

    }

    /**
     * 第三种 利用entrySet和iterator遍历key和value
     */

    @Test
    public void test3(){
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "ab");
        map.put(4, "ab");
        map.put(4, "ab");
        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

    }


    /**
     * 第四种方法:遍历map的所有的value
     */

    @Test
    public void test4(){
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "ab");
        map.put(4, "ab");
        map.put(4, "ab");
        Collection<String> values = map.values();
        for (String value : values){
            System.out.println(value);
        }
    }
}
