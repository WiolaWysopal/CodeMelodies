package com.codemelodies.codemelodies.controllers;

import com.codemelodies.codemelodies.models.PublicationFile;
import com.codemelodies.codemelodies.models.Publikacja;
import com.codemelodies.codemelodies.repositories.PublicationFileRepository;
import com.codemelodies.codemelodies.repositories.PublikacjaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api")
public class PublikacjeController {

    private final PublikacjaRepository publikacjaRepository;
    private final PublicationFileRepository publicationFileRepository;

    public PublikacjeController(PublikacjaRepository publikacjaRepository, PublicationFileRepository publicationFileRepository) {
        this.publikacjaRepository = publikacjaRepository;
        this.publicationFileRepository = publicationFileRepository;
    }

    @GetMapping("/publikacje")
    public ResponseEntity<List<Publikacja>> getPublikacje() {
        List<Publikacja> publikacje = publikacjaRepository.findAll();
        if (publikacje != null && !(publikacje.isEmpty())){
            return ResponseEntity.ok(publikacje);
        } else {
            return new ResponseEntity<List<Publikacja>>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping(value = "/publikacja/{uuid}", produces = MediaType.APPLICATION_PDF_VALUE)
    public ResponseEntity<byte[]> getPublikacja(@PathVariable UUID uuid) {
        Optional<PublicationFile> publicationFile = publicationFileRepository.findById(uuid);
        if (publicationFile.isPresent()){
            return ResponseEntity.ok(publicationFile.get().getFile());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
