package com.codemelodies.codemelodies.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

import java.util.UUID;

@Entity
@Getter
@Table(name = "publications")
public class Publikacja {
    @Id
    @Column(name = "publication_id")
    private UUID id;
    @Column(name = "title")
    private String title;
    @Column(name = "publication_file_id")
    private UUID publicationFileId;
}
