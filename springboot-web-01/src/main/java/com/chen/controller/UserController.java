package com.chen.controller;

import com.chen.pojo.User;
import com.chen.service.UserService;
import com.chen.service.impl.UserServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private UserService userService= new UserServiceImpl();
    @RequestMapping("/list")
    public List<User> list(){
        //3.返回数据
        return userService.findAll();

    }
}
