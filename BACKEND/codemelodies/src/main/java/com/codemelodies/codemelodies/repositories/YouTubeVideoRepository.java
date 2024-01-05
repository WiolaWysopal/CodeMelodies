package com.codemelodies.codemelodies.repositories;

import com.codemelodies.codemelodies.models.Icon;
import com.codemelodies.codemelodies.models.YouTubeVideo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface YouTubeVideoRepository extends JpaRepository<YouTubeVideo, UUID> {

}
