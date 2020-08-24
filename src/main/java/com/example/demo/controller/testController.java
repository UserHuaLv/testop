package com.example.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {


    @RequestMapping("/get")
    public String Test(){
        return "hehe";
    }
}
