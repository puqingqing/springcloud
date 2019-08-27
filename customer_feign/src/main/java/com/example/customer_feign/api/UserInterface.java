package com.example.customer_feign.api;

import com.example.customer_feign.bean.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "microapp")
public interface UserInterface {

    @RequestMapping("/user")
    public User getUser();
}
