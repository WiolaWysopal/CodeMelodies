package com.codemelodies.codemelodies.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

import java.util.UUID;

@Entity
@Getter
@Table(name = "youtubevideos")
public class YouTubeVideo {
    @Id
    @Column(name = "video_id")
    private UUID id;
    @Column(name = "title")
    private String title;
    @Column(name = "url")
    private String url;
    @Column(name = "default_width")
    private Integer defaultWidth;
    @Column(name = "default_height")
    private Integer defaultHeight;
}
