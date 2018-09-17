package cn.carryshuai.one.日期;

import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/9/10 11:49
 * @Description:
 */
public class Demo1 {

    @Test
    public void test1() throws ParseException {
        Date date = new Date();
        DateFormat format = new SimpleDateFormat("yyyyMMdd");
        Date date1 = format.parse("19950710");
        String s = format.format(date1);
        System.out.println(s);

    }


    /**
     * 时间加一天
     * @throws ParseException
     */
    @Test
    public void test2() throws ParseException {
        Date date = new Date();
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("今天是："+format.format(date));
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH,1);//今天加一
        Date time = calendar.getTime();
        System.out.println("明天是"+format.format(time));

    }

}
