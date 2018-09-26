package cn.carryshuai.bean;

import org.springframework.beans.factory.InitializingBean;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/9/19 09:43
 * @Description:
 */
public class Cat implements InitializingBean {
    public void afterPropertiesSet() throws Exception {
        System.out.println("init");
    }
}
