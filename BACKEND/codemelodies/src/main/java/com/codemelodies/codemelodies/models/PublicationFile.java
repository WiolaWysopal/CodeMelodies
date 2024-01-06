package com.codemelodies.codemelodies.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

import java.util.UUID;

@Entity
@Getter
@Table(name = "publication_files")
public class PublicationFile {
    @Id
    @Column(name = "publication_file_id")
    private UUID id;
    @Column(name = "file", columnDefinition="bytea")
    private byte[] file;
}
