package com.example.provide.Controller;

import com.example.provide.Compent.RedisUtils;
import com.example.provide.Service.TestService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    public TestService testService;

    @Autowired
    public RedisUtils redisUtils;

    @GetMapping("/hello")
    public Object getMsg() {
        String msg = testService.hello();
        return msg;
    }

    @GetMapping("/redis")
    public void redis(){
        redisUtils.set("string","testRedis");
    }
}
