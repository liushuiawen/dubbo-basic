package com.example.demo.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.demo.UserService;

@Service(version="1.0")
public class UserServiceImpl implements UserService {


    @Override
    public String testService() {
        return "adgfgf";
    }
}
