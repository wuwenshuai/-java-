package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 请求参数的封装分析
 * @author 黑马程序员
 * @Company http://www.ithiema.com
 */
@Controller
public class ParameterController1 {

    /**
     * 请求参数封装的分析
     * @param username
     * @param age
     */
    @RequestMapping("testParam1")
    public String testParam(String username,Integer age){
        System.out.println(username+","+age);
        return "success";
    }

}
