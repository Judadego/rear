package com.rear.rearArtifac.servicios;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.rear.rearArtifac.controllers.dto.LessorRegistroDto;
import com.rear.rearArtifac.entities.Lessor;

public interface LessorServicio extends UserDetailsService{

    public Lessor guardar(LessorRegistroDto registroDto);

    public List<Lessor> listarArrendatario();

    public Lessor get(Long id);

    public void delete(Long id);
    
}
