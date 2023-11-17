package com.codemelodies.codemelodies.models;

import lombok.Getter;
import lombok.AllArgsConstructor;

import java.time.LocalDateTime;


@Getter
@AllArgsConstructor
public class Wydarzenie {
    private Long id;
    private String nazwa;
    private LocalDateTime dataRozpoczecia;
    private String lokalizacja;

    // Gettery i konstruktor all-args są automatycznie generowane przez Lombok
}
