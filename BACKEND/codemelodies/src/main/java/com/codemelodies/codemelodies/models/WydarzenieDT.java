package com.codemelodies.codemelodies.models;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class WydarzenieDT {
    private UUID id;
    private String nazwa;
    private LocalDateTime dataRozpoczecia;
    private String lokalizacja;
    private List<EventTagDT> tagi;
}
