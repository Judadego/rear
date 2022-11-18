package com.rear.rearArtifac.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.rear.rearArtifac.controllers.dto.LessorRegistroDto;
import com.rear.rearArtifac.entities.Lessor;
import com.rear.rearArtifac.repositories.LessorRepository;

@Service
public class LessorServicioImp implements LessorServicio {

    @Autowired
    LessorRepository lRepository;

    public LessorServicioImp(LessorRepository lRepository) {
        super();
        this.lRepository = lRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        
        return null;
    }

    @Override
    public Lessor guardar(LessorRegistroDto registroDto) {
        Lessor lessor = new Lessor(
            registroDto.getFname(),
            registroDto.getLname(),
            registroDto.getNationality(),
            registroDto.getTypeDni()
        );
        return lRepository.save(lessor);
    }

    @Override
    public List<Lessor> listarArrendatario() {
        
        return lRepository.findAll();
    }

    @Override
    public Lessor get(Long id){
        return lRepository.findById(id).get();
    }

    @Override
    public void delete(Long id) {
       lRepository.deleteById(id);        
    }

}
