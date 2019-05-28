package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 控制器
 * @author 黑马程序员
 * @Company http://www.ithiema.com
 */
@Controller
public class ControllerDemo1 {

    @RequestMapping("/hello")
    public String sayHello(){
        System.out.println("Demo1控制器执行了。。。");
        return "success";
    }


    @RequestMapping("/hello2")
    public String sayHello2(){
        System.out.println("Demo1控制器的sayHell2方法执行了。。。");
        return "success";
    }
}
