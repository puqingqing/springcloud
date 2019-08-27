package com.example.client1.service;


import com.example.client1.bean.User;
import org.springframework.stereotype.Service;

@Service
public class UserImp implements  UserService {
    @Override
    public User getUser() {
        User user=new User();
        user.setUser("ss");
        user.setPassword("word");
        return user;
    }
}
