package com.codemelodies.codemelodies.controllers;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.codemelodies.codemelodies.models.Obraz;
import java.util.UUID;

@RestController
public class ObrazyController {

    // Zakomentowane, ponieważ nie mam jeszcze repozytorium
    // @Autowired
    // private ObrazRepository obrazRepository;

    @GetMapping("/zdjecia")
    public String getZdjecie() {
        // Pobranie informacji o zdjeciach
        return "Informacje o zdjeciach";
    }
    // Jak ogarnę bazę ze zdjęciami to poniższe ogarnia paginację
//    public Page<Obraz> getZdjecia(Pageable pageable) {
//        // Zakomentowane, ponieważ nie mam jeszcze repozytorium
//        // return obrazRepository.findAll(pageable);
//        return null; // tymczasowo zwróć null
//    }

    @GetMapping("/ikona")
    public String getIkona() {
        // Pobranie informacji o Ikonie
        return "Informacje o ikonach";
    }

    //Jak ogarnę bazę ze zdjęciami i ikonami, to poniższe gwarantuje UUID ikon
//    public Obraz getIkona(UUID id) {
//        // Zakomentowane, ponieważ nie mam jeszcze repozytorium
//        // return obrazRepository.findById(id).orElse(null);
//        return null; // tymczasowo zwróć null
//    }
}
