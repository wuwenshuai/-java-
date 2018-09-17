package cn.carryshuai.test;


import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/8/13 17:59
 * @Description:
 */
public class IntegerToString {



    @Test
    public void test(){
        Map<String,String> map = new HashMap();
        Integer integer = 3;
        map.put("pageSize",integer.toString());
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

    }

}
