package com.codemelodies.codemelodies.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloWorldController {
    @GetMapping ("/hello")
    public String getsayHello() {
        return "GET:: Hello World!";
    }

    @PostMapping ("/hello")
    public String postsayHello() {
        return "POST:: Hello World!";
    }
}
