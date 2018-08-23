package cn.carryshuai.one.遍历map.自定义map;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/8/23 14:46
 * @Description:
 */

import java.util.HashMap;
import java.util.Map;

/**
 * 自定义map的简单实现，暂不完美
 */
public class MyHashMapDemo {

    MyEntry[] entries = new MyEntry[100];
    int size;
    public int size(){
        return size;
    }

    //模拟put方法

    public void put(Object key,Object value){
        MyEntry entry = new MyEntry(key,value);
        //解决键值重复的问题
        for (int i = 0;i<size;i++){
            if (entries[i].key.equals(key)){
                entries[i].value = value;
                System.out.println("大兄弟，出错了");
                return;
            }
        }
        //
        entries[size++] = entry;
    }

    //根据key获取值
    public Object get(Object key){
        for (int i = 0;i<size;i++){
            if (entries[i].key.equals(key)){
                //获取到了
                return entries[i].value;
            }
        }
        return null;
    }



    public static void main(String[] args) {
        MyHashMapDemo hashMapDemo = new MyHashMapDemo();
        hashMapDemo.put("a","a");
        hashMapDemo.put("b","b");
        System.out.println(hashMapDemo.size());
        System.out.println(hashMapDemo.get("a"));
        System.out.println(hashMapDemo.containsKey("a"));
        System.out.println(hashMapDemo.containsKey("c"));
    }

    //判断是否包含这个key

    public boolean containsKey(Object key){
        for (int i =0;i<size;i++){
            if (entries[i].value.equals(key)){
                return true;
            }
        }
        return false;
    }
}

class MyEntry{
    Object key;
    Object value;

    public MyEntry(Object key, Object value) {
        this.key = key;
        this.value = value;
    }
}