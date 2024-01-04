package com.codemelodies.codemelodies.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

import java.util.UUID;

@Entity
@Getter
@Table(name = "socialmediaicons")
public class Icon {
    @Id
    @Column(name = "icon_id")
    private UUID id;
    @Column(name = "image", columnDefinition="bytea")
    private byte[] image;
}
