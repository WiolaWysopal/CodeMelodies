package com.codemelodies.codemelodies.controllers;
import com.codemelodies.codemelodies.models.Biogram;
import com.codemelodies.codemelodies.repositories.BiogramRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class OMnieController {

    private final BiogramRepository biogramRepository;

    public OMnieController(BiogramRepository biogramRepository) {
        this.biogramRepository = biogramRepository;
    }

    @GetMapping("/about")
    public ResponseEntity<String> getOMnie() {
        Optional<Biogram> biogram = biogramRepository.findLatestBiogram();
        return biogram.map(value -> ResponseEntity.ok(value.getBiogramContent())).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
