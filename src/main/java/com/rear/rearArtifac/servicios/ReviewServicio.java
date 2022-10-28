package com.rear.rearArtifac.servicios;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.rear.rearArtifac.controllers.dto.ReviewRegistroDto;
import com.rear.rearArtifac.entities.Review;

public interface ReviewServicio extends UserDetailsService {
    public Review guardar(ReviewRegistroDto registroDto);
    
    public List<Review> listarReviews();
}
