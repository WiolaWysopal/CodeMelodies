package com.codemelodies.codemelodies.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OMnieController {

    @GetMapping("/omnie")
    public String getOMnie() {
        // Pobranie biogramu z bazy danych
        return "Biogram z bazy danych";
    }
}
