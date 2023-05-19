package com.example.bbb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("home")
public class Hello {
    @GetMapping("/hell0")
        public String hello(){
        return "hello word";
    }

}
