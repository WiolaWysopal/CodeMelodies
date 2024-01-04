package com.codemelodies.codemelodies.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

import java.sql.Timestamp;

@Entity
@Getter
@Table(name = "Biograms")
public class Biogram {
    @Id
    @Column(name = "biogram_timestamp_id")
    private Timestamp biogramTimestampId;
    @Column(name = "biogram_content")
    private String biogramContent;
}
