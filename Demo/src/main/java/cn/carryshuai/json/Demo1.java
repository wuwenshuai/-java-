package cn.carryshuai.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import java.util.Map;
import java.util.Set;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/8/24 10:24
 * @Description:JsonObject
 */
public class Demo1 {


    @Test
    public void test1(){


        JSONObject jsonObject = new JSONObject();
        jsonObject.put("上海银行","1000");
        jsonObject.put("建设银行","1001");
        jsonObject.put("中国银行","1002");
        jsonObject.put("工商银行","1003");
        String string = jsonObject.getString("上海银行");
        System.out.println(string);
        String string1 = jsonObject.getString("1001");
        System.out.println(string1);


      Map map = (Map) JSON.parse(jsonObject.toString());
        Set<String> set = map.keySet();
        for (String name : set){
            System.out.println(name);
        }


    }
}
