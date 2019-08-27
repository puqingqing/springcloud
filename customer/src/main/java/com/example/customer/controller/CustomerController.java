package com.example.customer.controller;


import com.example.customer.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class CustomerController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/user")
    public void getUser(){
        //服务接口请求参数对象，并填充参数
        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();

        //声明请求实体HttpEntity，并填入请求参数
        HttpEntity<MultiValueMap<String, String>> requestEntity = new HttpEntity<>(null, null);
        //由于返回对象不是泛型，所以也不需要先获取内部类型，直接调用并传递请求对象
        //第一个参数是服务名称及服务地址
        ResponseEntity<User> responseEntity = restTemplate.exchange("http://microapp:8088/user", HttpMethod.POST, requestEntity,User.class );

        //自动序列化返回对象
        User modelEx = responseEntity.getBody();
        System.out.println("modelEx:"+modelEx);
    }

}
