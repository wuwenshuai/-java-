package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * PathVariable的封装分析
 * @author 黑马程序员
 * @Company http://www.ithiema.com
 */
@Controller
public class ParameterController4 {

    /**
     * 请求参数封装的分析
     */
    @RequestMapping("testParam4/{username}/{age}")
    public void testParam(@PathVariable("username") String username, @PathVariable Integer age){
        System.out.println(username+","+age);
    }

}
