package com.example.customer_feign.controller;

import com.example.customer_feign.api.UserInterface;
import com.example.customer_feign.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Autowired
    private UserInterface userInterface;

    @RequestMapping("/user")
    public void getUser(){
        User user = userInterface.getUser();
        System.out.println("user  :"+user);
    }
}
