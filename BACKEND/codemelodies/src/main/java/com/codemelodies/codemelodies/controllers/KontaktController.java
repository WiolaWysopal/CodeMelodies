package com.codemelodies.codemelodies.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class KontaktController {

    @GetMapping("/kalendarz")
    public String getKalendarz() {
        // Pobranie informacji o kalendarzu
        return "Informacje o kalendarzu";
    }

    @GetMapping("/socialmedia")
    public String getSocialMedia() {
        // Pobranie informacji o mediach społecznościowych
        return "Informacje o mediach społecznościowych";
    }
}