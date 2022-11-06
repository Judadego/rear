package com.rear.rearArtifac.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.rear.rearArtifac.controllers.dto.PropertyRegistroDto;
import com.rear.rearArtifac.entities.Property;
import com.rear.rearArtifac.repositories.PropertyRepository;

public class PropertyServiceImp implements PropertyServicio{

    @Autowired
    public PropertyRepository pRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       
        return null;
    }

    @Override
    public Property guardar(PropertyRegistroDto registroDto) {
        Property property = new Property(
            registroDto.getCity(),
            registroDto.getAddress(),
            registroDto.getDepartament()
        );
        return pRepository.save(property);
    }

    @Override
    public List<Property> listarProperties() {
        
        return pRepository.findAll();
    }
    
}
