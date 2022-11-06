package com.rear.rearArtifac.servicios;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.rear.rearArtifac.controllers.dto.PropertyRegistroDto;
import com.rear.rearArtifac.entities.Property;

public interface PropertyServicio extends UserDetailsService {
    
    public Property guardar(PropertyRegistroDto registroDto);
    public List<Property> listarProperties();
}
