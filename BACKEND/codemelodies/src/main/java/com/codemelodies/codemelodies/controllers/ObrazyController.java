package com.codemelodies.codemelodies.controllers;

import com.codemelodies.codemelodies.models.Icon;
import com.codemelodies.codemelodies.models.Obraz;
import com.codemelodies.codemelodies.repositories.IconRepository;
import com.codemelodies.codemelodies.repositories.ObrazRepository;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class ObrazyController {

    Logger logger = LoggerFactory.getLogger(ObrazyController.class);
    private final ObrazRepository obrazRepository;
    private final IconRepository iconRepository;
    public ObrazyController(ObrazRepository obrazRepository, IconRepository iconRepository) {
        this.obrazRepository = obrazRepository;
        this.iconRepository = iconRepository;
    }

    @GetMapping(value = "/photo/{uuid}", produces = MediaType.IMAGE_PNG_VALUE)
    public ResponseEntity<byte[]> getZdjecie(@PathVariable UUID uuid) {
        logger.info(uuid.toString());
        Optional<Obraz> znalezionyObraz = obrazRepository.findById(uuid);
        return znalezionyObraz.map(obraz -> ResponseEntity.ok(obraz.getImage())).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping(value = "/photosids", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<UUID>> getZdjeciaIds() {
        UUID excludedUuid = UUID.fromString("ba5ae4f1-377d-4721-b690-a6edeba36449");
        List<Obraz> obrazy = obrazRepository.findAll();
        List<UUID> ids = obrazy.stream()
                .map(Obraz::getId)
                .filter(id -> !id.equals(excludedUuid))
                .collect(Collectors.toList());
        return ResponseEntity.ok(ids);
    }


    @GetMapping(value = "/icon/{uuid}", produces = MediaType.IMAGE_PNG_VALUE)
    public ResponseEntity<byte[]> getIkona(@PathVariable UUID uuid) {
        Optional<Icon> znalezionaIkona = iconRepository.findById(uuid);
        return znalezionaIkona.map(icon -> ResponseEntity.ok(icon.getImage())).orElseGet(() -> ResponseEntity.notFound().build());
    }






}