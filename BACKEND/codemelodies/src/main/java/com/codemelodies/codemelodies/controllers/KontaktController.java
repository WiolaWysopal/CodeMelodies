package com.codemelodies.codemelodies.controllers;
import com.codemelodies.codemelodies.models.Wydarzenie;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import static org.springframework.http.ResponseEntity.ok;


@RestController
public class KontaktController {

    @GetMapping("/wydarzenia")
    public ResponseEntity<List<Wydarzenie>> getWydarzenia() {
        Wydarzenie koncert1 = new Wydarzenie(
                1L, // ID
                "Koncert Rockowy", // Nazwa
                LocalDateTime.of(2023, 11, 20, 19, 0), // Data i Czas Rozpoczęcia
                "Amfiteatr Miejski" // Lokalizacja
        );

        Wydarzenie koncert2 = new Wydarzenie(
                2L,
                "Festiwal Jazzowy",
                LocalDateTime.of(2023, 11, 21, 20, 0),
                "Klub Jazzowy Blue Note"
        );

        Wydarzenie koncert3 = new Wydarzenie(
                3L,
                "Wieczór Muzyki Klasycznej",
                LocalDateTime.of(2023, 11, 22, 18, 0),
                "Sala Koncertowa Filharmonii"
        );

        List<Wydarzenie> wydarzenia = Arrays.asList(koncert1, koncert2, koncert3);
        return ResponseEntity.ok(wydarzenia);
    }

    @GetMapping("/socialmedia")
    public String getSocialMedia() {
        // Pobranie informacji o mediach społecznościowych
        return "Informacje o mediach społecznościowych";
    }
}