package com.lyf.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Value("${hello}")
    private String name;

    @GetMapping("/hello")
    public String hello(String name){
        System.out.println(name);
        return "hello,"+name;
    }
}
