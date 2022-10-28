package com.rear.rearArtifac.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.rear.rearArtifac.controllers.dto.ReviewRegistroDto;
import com.rear.rearArtifac.entities.Review;
import com.rear.rearArtifac.entities.Usuario;
import com.rear.rearArtifac.repositories.ReviewRepository;

@Service
public class ReviewServicioImpl implements ReviewServicio {

    @Autowired
    public ReviewRepository rvwRepo;

    public ReviewServicioImpl(ReviewRepository rvwRepo) {
        super();
        this.rvwRepo = rvwRepo;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // TODO Auto-generated method stub
        return null;
    }

    Usuario user = new Usuario();
// Aqui vamos, hay que probar si con usuarioRepository podemos acceder al usuario actual
//para relacionarlo con su respectiva review
    @Override
    public Review guardar(ReviewRegistroDto registroDto) {
        Review review = new Review(
            registroDto.getPuntuaction(),
            registroDto.getdStart(),
            registroDto.getdEnd(),
            user,            
            registroDto.getId_lessor(), 
            registroDto.getId_property()
        );
        return null;
    }

    @Override
    public List<Review> listarReviews() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
