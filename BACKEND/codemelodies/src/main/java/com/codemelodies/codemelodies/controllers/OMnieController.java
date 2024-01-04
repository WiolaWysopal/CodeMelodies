package com.codemelodies.codemelodies.controllers;
import com.codemelodies.codemelodies.models.Biogram;
import com.codemelodies.codemelodies.repositories.BiogramRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class OMnieController {

    private final BiogramRepository biogramRepository;

    public OMnieController(BiogramRepository biogramRepository) {
        this.biogramRepository = biogramRepository;
    }

    @GetMapping("/omnie")
    public ResponseEntity<String> getOMnie() {
        Optional<Biogram> biogram = biogramRepository.findLatestBiogram();
        if (biogram.isPresent()) {
            return ResponseEntity.ok(biogram.get().getBiogramContent());
       } else {
            return ResponseEntity.notFound().build();
       }
    }
}
