package cn.carryshuai.test;

import cn.carryshuai.Domain.CreditInfo;
import org.junit.jupiter.api.Test;


import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/8/15 16:43
 * @Description:
 */
public class TestDemo {






    @Test
    public void test(){
        System.out.println(isCreditStatus());


    }
    public boolean isCreditStatus(){
        Map<String,Object> map = new HashMap<String, Object>();
        CreditInfo creditInfo = new CreditInfo();
        creditInfo.setCardId("1");
        creditInfo.setPhone("1");
        map.put("creditInfo",creditInfo);

        boolean phone = map.containsValue(creditInfo);
        return phone;
    }
}
