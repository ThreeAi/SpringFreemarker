package com.petproject.SpringFreemarker.controllers;

import com.petproject.SpringFreemarker.models.Image;
import com.petproject.SpringFreemarker.repositories.ImagesRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.ByteArrayInputStream;

@RestController
@RequiredArgsConstructor
public class ImageController {

    private final ImagesRepository imagesRepository;

    @GetMapping("/images/{id}")
    @Transactional
    public ResponseEntity<?> getImageById(@PathVariable Long id) {
        Image image = imagesRepository.findById(id).orElse(null);
        return ResponseEntity.ok()
                .header("fileName", image.getOriginalFileName())
                .contentType(MediaType.valueOf(image.getContentType()))
                .body(new InputStreamResource(new ByteArrayInputStream(image.getBytes())));
    }
}
