package com.codemelodies.codemelodies.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class YouTubeController {
    @GetMapping("/youtube")
    public String getYouTube() {
        // Pobranie listy linków z bazy danych
        return "Lista linków do YouTube";
    }
}