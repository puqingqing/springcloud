package com.example.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class CustomerApplication {

    public static void main(String[] args)
    {
        SpringApplication.run(CustomerApplication.class, args);
    }

    @Bean
    @LoadBalanced //客户端负载均衡
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
