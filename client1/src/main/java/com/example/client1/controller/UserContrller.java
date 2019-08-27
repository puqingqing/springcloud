package com.example.client1.controller;


import com.example.client1.bean.User;
import com.example.client1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserContrller {

    @Autowired
    private UserService userService;

    @RequestMapping("/user")
    public User getUser(){
        return userService.getUser();
    }
}
