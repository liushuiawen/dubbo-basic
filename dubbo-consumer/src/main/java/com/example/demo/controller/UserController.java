package com.example.demo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.demo.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Reference(version = "1.0",timeout = 6000,url="localhost:20880")
    private UserService userService;

    @RequestMapping(value = "/find",method = RequestMethod.GET)
    public String findByName(String name){
        return userService.testService();
    }


}
