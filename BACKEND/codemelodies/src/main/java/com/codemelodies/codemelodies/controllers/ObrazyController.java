package com.codemelodies.codemelodies.controllers;

import com.codemelodies.codemelodies.models.Obraz;
import com.codemelodies.codemelodies.models.Wydarzenie;
import com.codemelodies.codemelodies.repositories.ObrazRepository;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ObrazyController {

    //Logger logger = LoggerFactory.getLogger(ObrazyController.class);
    private final ObrazRepository obrazRepository;
    public ObrazyController(ObrazRepository obrazRepository) {
        this.obrazRepository = obrazRepository;
    }

    @GetMapping(value = "/zdjecia", produces = MediaType.IMAGE_PNG_VALUE)
    public ResponseEntity<byte[]> getZdjecie() {
        //logger.info("");
        List<Obraz> obrazy = obrazRepository.findAll();
        return ResponseEntity.ok(obrazy.get(0).getImage());
    }

    @GetMapping("/ikona")
    public String getIkona() {
        // Pobranie informacji o Ikonie
        return "Informacje o ikonach";
    }
}