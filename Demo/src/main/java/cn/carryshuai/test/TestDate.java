package cn.carryshuai.test;

import cn.carryshuai.util.DateUtil;
import org.junit.jupiter.api.Test;


import java.util.Date;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/8/10 10:22
 * @Description:
 */
public class TestDate {

    @Test
    public void test(){
        Date date1 = new Date();
        long time = date1.getTime();
        System.out.println(time);
        Date date = DateUtil.convert2Date("1533868001241", "yyyyMMdd");

        System.out.println(date);
    }
}
