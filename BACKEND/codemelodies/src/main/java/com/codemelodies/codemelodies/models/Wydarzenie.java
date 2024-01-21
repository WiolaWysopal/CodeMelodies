package com.codemelodies.codemelodies.models;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import java.time.LocalDateTime;


@Entity
@Getter
@Table(name = "Events")
public class Wydarzenie {
    @Id
    @Column(name = "event_id")
    private UUID id;
    @Column(name = "nazwa")
    private String nazwa;
    @Column(name = "data_rozpoczecia")
    private LocalDateTime dataRozpoczecia;
    @Column(name = "lokalizacja")
    private String lokalizacja;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "events_to_tags",
            joinColumns = { @JoinColumn(name = "event_id") },
            inverseJoinColumns = { @JoinColumn(name = "tag_name") })
    Set<EventTag> tags = new HashSet<>();
}
