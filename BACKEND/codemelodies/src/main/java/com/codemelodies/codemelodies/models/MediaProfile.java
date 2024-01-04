package com.codemelodies.codemelodies.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

import java.util.UUID;

@Entity
@Getter
@Table(name = "socialmediaprofiles")
public class MediaProfile {

    @Id
    @Column(name = "medium_name")
    private String mediumName;
    @Column(name = "profile_url")
    private String profileURL;
    @Column(name = "icon_id")
    private UUID iconId;
}
