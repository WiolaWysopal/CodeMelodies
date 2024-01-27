package com.codemelodies.codemelodies.controllers;
import com.codemelodies.codemelodies.models.YouTubeVideo;
import com.codemelodies.codemelodies.repositories.YouTubeVideoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api")
public class YouTubeController {
    private final YouTubeVideoRepository youTubeVideoRepository;

    public YouTubeController(YouTubeVideoRepository youTubeVideoRepository){
        this.youTubeVideoRepository = youTubeVideoRepository;
    }

    @GetMapping(value = "/youtube", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<YouTubeVideo>> getYouTubeVideos() {
        List<YouTubeVideo> youTubeVideos = youTubeVideoRepository.findAll();
        if(!(youTubeVideos.isEmpty())){
            return ResponseEntity.ok(youTubeVideos);
        } else {
            return new ResponseEntity<List<YouTubeVideo>>(HttpStatus.NOT_FOUND);
        }


    }
}