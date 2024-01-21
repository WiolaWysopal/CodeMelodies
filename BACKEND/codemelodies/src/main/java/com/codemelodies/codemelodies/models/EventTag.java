package com.codemelodies.codemelodies.models;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Table(name = "tags")
public class EventTag {
    @Id
    @Column(name = "name")
    private String name;
    @Column(name = "color")
    private String color;
    @ManyToMany(mappedBy = "tags")
    private Set<Wydarzenie> wydarzenia = new HashSet<>();
}
