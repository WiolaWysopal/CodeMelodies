package com.codemelodies.codemelodies.controllers;
import com.codemelodies.codemelodies.models.Wydarzenie;
import com.codemelodies.codemelodies.repositories.WydarzenieRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class KontaktController {

    private final WydarzenieRepository wydarzenieRepository;
    public KontaktController(WydarzenieRepository wydarzenieRepository) {
        this.wydarzenieRepository = wydarzenieRepository;
    }

    @GetMapping("/wydarzenia")
    public ResponseEntity<List<Wydarzenie>> getWydarzenia() {
        List<Wydarzenie> wydarzenia = wydarzenieRepository.findAll();
        return ResponseEntity.ok(wydarzenia);
    }

    @GetMapping("/socialmedia")
    public String getSocialMedia() {
        // Pobranie informacji o mediach społecznościowych
        return "Informacje o mediach społecznościowych";
    }
}