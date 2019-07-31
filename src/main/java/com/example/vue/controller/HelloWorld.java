package com.example.vue.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * controller层
 */
@RestController
public class HelloWorld {
    @RequestMapping("helloWorld")
    public String HelloWorld(){
        return "Hello World!";
    }
}
