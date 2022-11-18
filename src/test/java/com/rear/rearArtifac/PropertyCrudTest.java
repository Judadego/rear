package com.rear.rearArtifac;

import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.rear.rearArtifac.repositories.PropertyRepository;
import com.rear.rearArtifac.entities.Property;

@DataJpaTest
@AutoConfigureTestDatabase( replace = Replace.NONE)
public class PropertyCrudTest {

    @Autowired
    PropertyRepository propRepo;

    @Test
    public void createProperty (){

        Property Created;

        Property propCreated = new Property(
            "Duitama",
            "Boyacá",
            "cra 21 N 22 - 05");
        try{
            Created = propRepo.save(propCreated);
            assertNotNull(Created.getId_property());
            assertTrue(Created.getId_property()>0);
            System.out.println("Se guardó exitosamente");
        } catch(Exception e){
            System.out.println(e);
        }
    }

    
}
