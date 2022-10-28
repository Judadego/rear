package com.rear.rearArtifac.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.rear.rearArtifac.entities.Review;

public interface ReviewRepository extends JpaRepository<Review, Integer> {
    
}
