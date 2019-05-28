package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * RequestBody的封装分析
 * @author 黑马程序员
 * @Company http://www.ithiema.com
 */
@Controller
public class ParameterController3 {

    /**
     * 请求参数封装的分析
     * @param body
     */
    @RequestMapping("testParam3")
    public void testParam(@RequestBody String body){
        System.out.println(body);
    }

}
