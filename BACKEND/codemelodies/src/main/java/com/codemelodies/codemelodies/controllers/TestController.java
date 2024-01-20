package com.codemelodies.codemelodies.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.codemelodies.codemelodies.repositories.UserRepository;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TestController {

    private final UserRepository userRepository;

    public TestController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

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