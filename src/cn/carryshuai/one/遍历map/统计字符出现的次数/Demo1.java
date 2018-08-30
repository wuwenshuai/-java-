package cn.carryshuai.one.遍历map.统计字符出现的次数;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/8/30 15:57
 * @Description:
 */

import cn.carryshuai.one.遍历map.domain.Latter;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 统计单词出现的次数
 */
public class Demo1 {

    public static void main(String[] args) {


        //方法一：为所有的key创建容器，之后容器存放对应的value
        String kes = "my name is carry hello everyone my name is jerry";
        String[] strings = kes.split(" ");
        Map<String,Latter> map = new HashMap<>();
        for (String name : strings){
            if (!map.containsKey(name)){
                map.put(name,new Latter());
            }
            //存放对应的value
            Latter latter = map.get(name);
            latter.setCount(latter.getCount()+1);
        }
        //输出map的值
        Set<String> set = map.keySet();
        for (String s : set){
            System.out.println("单词：" + s + "出现的次数：" + map.get(s).getCount());
        }
    }
}
