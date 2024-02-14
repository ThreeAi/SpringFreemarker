package com.petproject.SpringFreemarker.repositories;

import com.petproject.SpringFreemarker.models.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImagesRepository extends JpaRepository<Image, Long> {

}
