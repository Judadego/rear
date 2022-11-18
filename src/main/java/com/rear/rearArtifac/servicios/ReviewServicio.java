package com.rear.rearArtifac.servicios;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.rear.rearArtifac.controllers.dto.ReviewCompletaDto;

import com.rear.rearArtifac.entities.Review;

public interface ReviewServicio extends UserDetailsService {
    
    public Review guardar(ReviewCompletaDto registroDto);  //save
      
    public List<Review> listarReviews();

    public Review buscarPorId (Integer id);
    
    public Review get(Integer id);

    public void delete(Integer id);
    //public int save(Review review);
    //public void delete(int id);

    //Por implementar
    public Page<Review> findAll(Pageable pageabe);

    public Review findOne(Integer id);
}
