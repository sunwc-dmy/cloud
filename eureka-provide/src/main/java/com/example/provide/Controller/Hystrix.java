package com.example.provide.Controller;

import com.example.provide.Service.TestService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import feign.hystrix.FallbackFactory;
import org.bouncycastle.util.test.Test;
import org.springframework.stereotype.Component;

@Component
public class Hystrix implements FallbackFactory<TestService> {
    @Override
    public TestService create(Throwable throwable) {
        return new TestService() {
            @Override
            public String hello() {
                return "祝您 2019 猪年大吉，'猪'事如意！";
            }
        };
    }
}
