package com.rear.rearArtifac.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rear.rearArtifac.entities.Property;

public interface PropertyRepository extends JpaRepository<Property, Integer> {
    
}
