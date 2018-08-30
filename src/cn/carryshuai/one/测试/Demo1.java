package cn.carryshuai.one.测试;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/8/28 17:01
 * @Description:
 */
public class Demo1 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        User user = new User();
        if (1>0){
         ;
            list.add("1");
        }
        if (2>0){

            list.add("2");
        }
        for (String user1 : list){
            System.out.println(user1);
        }



    }
}
