package com.codemelodies.codemelodies.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @PostMapping("/login")
    public String postLogin() {
        // Logika logowania, pamiętaj aby nigdy nie logować wrażliwych danych!
        return "Zalogowano";
    }
    //Jak dodam bazę, odblokowac poniższe
//    public String postLogin(@RequestBody UserCredentials credentials) {
//        // Logika logowania, pamiętaj aby nigdy nie logować wrażliwych danych!
//        return "Zalogowano";
//    }

    @PostMapping("/wyloguj")
    public String postWyloguj() {
        // Logika wylogowywania
        return "Wylogowano";
    }

    static class UserCredentials {
        private String username;
        private String password;

        // Gettery, settery, konstruktory itp.
    }
}
