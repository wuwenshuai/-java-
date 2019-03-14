package com.carry.controller;


import com.carry.pojo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(description = "用户相关的操作")
public class UserController {

    @GetMapping("/user")
    @ApiOperation("获取用户")
    public String getUser(){
        return "1111";
    }

    @GetMapping("/getUserById/{id}")
    @ApiOperation("根据id获取用户")
    public User getUserByid(@PathVariable("id") Integer id){
        User user = User.builder()
                .id(id)
                .name("carry")
                .addr("上海市浦东新区")
                .build();
        return user;
    }

}
