package com.example.provide.Service;

import com.example.provide.Controller.Hystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "service",fallbackFactory = Hystrix.class)
public interface TestService {

    @RequestMapping("/hello")
    String hello();
}
