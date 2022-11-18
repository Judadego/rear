package com.rear.rearArtifac;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;

import com.rear.rearArtifac.entities.Lessor;
import com.rear.rearArtifac.repositories.LessorRepository;

@DataJdbcTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class LessorCrudTest {

@Autowired
LessorRepository lssrRepo;

    @Test
    public void createLessor(){

        Long id = (long)123123;
        String fname = "kin";
        String lname = "Kong";
        String nacionalidad= "Colombia";
        String type = "CC";

        Lessor creado;

        Lessor lessor = new Lessor(id,fname, lname,nacionalidad,type);
        try{
            creado = lssrRepo.save(lessor);
            assertNotNull(creado.getId_lessor());
            assertTrue(creado.getId_lessor()> 0);
            System.out.println("Se guardó exitosamente");
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
