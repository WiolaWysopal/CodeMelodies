package com.codemelodies.codemelodies.controllers;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.UUID;

@RestController
public class ObrazyController {

    @GetMapping("/zdjecia")
    public String getZdjecie() {
        // Pobranie informacji o zdjeciach
        return "Informacje o zdjeciach";
    }

    @GetMapping("/ikona")
    public String getIkona() {
        // Pobranie informacji o Ikonie
        return "Informacje o ikonach";
    }
}