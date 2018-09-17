package cn.carryshuai.one.测试;

import org.junit.Test;

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

    @Test
    public void test(){
        String repayFailReason = null;
        String retMsg = null;
        //拼接失败原因字段
        String failMessage = null;
        if (repayFailReason == null){
            failMessage = retMsg;
        }else if (retMsg == null){
            failMessage = repayFailReason;
        }
        else {
            failMessage = retMsg+","+repayFailReason;
        }
        System.out.println(failMessage);
    }
}
