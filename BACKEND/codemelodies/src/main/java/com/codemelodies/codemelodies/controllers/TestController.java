package com.codemelodies.codemelodies.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class TestController {
    @GetMapping ("/test")
    public String getsayHello() {
        return "GET:: Hello World!";
    }

    @PostMapping ("/test")
    public String postsayHello() {
        return "POST:: Hello World!";
    }
}
//http://localhost:8080/swagger-ui/index.html#/