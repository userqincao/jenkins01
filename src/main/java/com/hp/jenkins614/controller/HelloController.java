package com.hp.jenkins614.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello Jenkins ！！！";
    }

    @GetMapping("/ss")
    public String ss(){
        return "ss";
    }

}
