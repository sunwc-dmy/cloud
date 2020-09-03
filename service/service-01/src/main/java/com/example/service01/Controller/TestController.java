package com.example.service01.Controller;

import com.example.service01.Service.TestService;
import org.aspectj.weaver.ast.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "hello-01";
    }
}
