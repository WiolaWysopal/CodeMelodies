package com.codemelodies.codemelodies.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.AllArgsConstructor;

import java.time.LocalDateTime;


@Entity
@Getter
@Table(name = "Events")
public class Wydarzenie {
    @Id
    @Column(name = "event_id")
    private Long id;
    @Column(name = "nazwa")
    private String nazwa;
    @Column(name = "data_rozpoczecia")
    private LocalDateTime dataRozpoczecia;
    @Column(name = "lokalizacja")
    private String lokalizacja;

    // Gettery i konstruktor all-args są automatycznie generowane przez Lombok
}
