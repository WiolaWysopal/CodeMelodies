package com.codemelodies.codemelodies.controllers;
import com.codemelodies.codemelodies.mappers.WydarzenieMapper;
import com.codemelodies.codemelodies.models.MediaProfile;
import com.codemelodies.codemelodies.models.Obraz;
import com.codemelodies.codemelodies.models.Wydarzenie;
import com.codemelodies.codemelodies.models.WydarzenieDT;
import com.codemelodies.codemelodies.repositories.MediaProfileRepository;
import com.codemelodies.codemelodies.repositories.WydarzenieRepository;
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
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class KontaktController {

    private final WydarzenieRepository wydarzenieRepository;
    private final MediaProfileRepository mediaProfileRepository;
    public KontaktController(WydarzenieRepository wydarzenieRepository, MediaProfileRepository mediaProfileRepository) {
        this.wydarzenieRepository = wydarzenieRepository;
        this.mediaProfileRepository = mediaProfileRepository;
    }

    @GetMapping("/events")
    public ResponseEntity<List<WydarzenieDT>> getWydarzenia() {
        List<Wydarzenie> wydarzenia = wydarzenieRepository.findAll();
        if (wydarzenia == null || (wydarzenia.isEmpty())){
            return new ResponseEntity<List<WydarzenieDT>>(HttpStatus.NOT_FOUND);
        }
        List<WydarzenieDT> wydarzeniaDT = wydarzenia.stream().map(WydarzenieMapper::map).toList();

        return ResponseEntity.ok(wydarzeniaDT);
    }

    @GetMapping(value = "/socialmedia", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<MediaProfile>> getSocialMediaProfiles() {
        List<MediaProfile> profiles = mediaProfileRepository.findAll();
        return ResponseEntity.ok(profiles);
    }
}