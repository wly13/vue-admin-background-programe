package com.example.vue.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityController {
    @RequestMapping("City")
    public String City(){
        return "this is a City";
    }
}
