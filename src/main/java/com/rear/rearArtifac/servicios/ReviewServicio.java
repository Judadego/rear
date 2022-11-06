package com.rear.rearArtifac.servicios;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.rear.rearArtifac.controllers.dto.ReviewCompletaDto;

import com.rear.rearArtifac.entities.Review;

public interface ReviewServicio extends UserDetailsService {
    
    public Review guardar(ReviewCompletaDto registroDto);  
      
    public List<Review> listarReviews();
    //public int save(Review review);
    //public void delete(int id);
}
