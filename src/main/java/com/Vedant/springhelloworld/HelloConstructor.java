package com.Vedant.springhelloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloConstructor {
@RequestMapping("/hello")
    public String HelloWorld(){
        return "Hello World";
    }
}
