package com.codemelodies.codemelodies.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublikacjeController {

    @GetMapping("/publikacje")
    public String getPublikacje(@RequestHeader("Authorization") String token) {
        // Weryfikacja tokena i pobranie publikacji dla zalogowanego użytkownika
        return "Publikacje dla użytkownika";
    }
}
