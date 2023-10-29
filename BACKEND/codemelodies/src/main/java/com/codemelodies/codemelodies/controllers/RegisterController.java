package com.codemelodies.codemelodies.controllers;

import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {

    @PostMapping("/register")
    public String postRegister() {
        // Logika rejestracji
        return "Zarejestrowano";
    }
    //Odblokować jak będzie baza z użytkownikami
//    public String postRegister(@RequestBody UserCredentials credentials) {
//        // Logika rejestracji
//        return "Zarejestrowano";
//    }

    static class UserCredentials {
        private String username;
        private String password;
        private String email;

        // Gettery, settery, konstruktory itp.
    }
}
