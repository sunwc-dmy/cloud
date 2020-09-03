package com.example.provide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

//服务注册到eureka
@EnableDiscoveryClient
@SpringBootApplication
//开启hystrix
@EnableCircuitBreaker
//开启feign
@EnableFeignClients
//开启Ribbon
//@RibbonClient(name="service1")
public class EurekaProvideApplication {

//    @Bean
//    @LoadBalanced //负载均衡
//    public RestTemplate restTemplate() {
//        return new RestTemplate();
//    }
    public static void main(String[] args) {
        SpringApplication.run(EurekaProvideApplication.class, args);
    }
}
