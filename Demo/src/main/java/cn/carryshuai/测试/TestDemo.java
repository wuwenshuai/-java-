package cn.carryshuai.测试;

import cn.carryshuai.Domain.CarInterface;
import org.apache.commons.lang.StringUtils;
import org.junit.jupiter.api.Test;

import java.util.concurrent.FutureTask;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/8/27 19:51
 * @Description:
 */
public class TestDemo {

    public static void main(String[] args) {
        String a = null;
        String b = "s";
        if (StringUtils.isEmpty(a) && StringUtils.isEmpty(b)){
            System.out.println("a和b不能同时为空");
        }else {
            System.out.println("gg");
        }

        if (StringUtils.isEmpty(a) || StringUtils.isEmpty(b)){
            System.out.println("a和b同时为空");
        }else {
            System.out.println("gg");
        }
    }
}
