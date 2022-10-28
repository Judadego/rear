package com.rear.rearArtifac.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.rear.rearArtifac.entities.Lessor;

//No olvidar que es public interface para el repositories
public interface LessorRepository extends JpaRepository< Lessor , Long>{
    
}
