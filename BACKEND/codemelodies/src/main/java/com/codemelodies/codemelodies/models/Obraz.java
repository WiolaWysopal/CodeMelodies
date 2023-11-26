package com.codemelodies.codemelodies.models;

import jakarta.persistence.*;
import lombok.Getter;
import java.util.UUID;

@Entity
@Getter
@Table(name = "Images")
public class Obraz {
    @Id
    @Column(name = "image_id")
    private UUID id;
    @Column(name = "image", columnDefinition="bytea")
    private byte[] image;

    // Gettery generowane są przez Lombok
    // @Lob psuła działanie endpointa: https://stackoverflow.com/questions/75042081/hibernate-6-postgres-and-bytea
}
