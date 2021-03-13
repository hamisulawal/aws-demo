package com.awstest.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class Control {

    @GetMapping("")
    public String hello(){
        return "welcome to Spring";
    }
}
