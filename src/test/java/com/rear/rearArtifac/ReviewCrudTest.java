package com.rear.rearArtifac;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.rear.rearArtifac.entities.*;

import com.rear.rearArtifac.repositories.LessorRepository;
import com.rear.rearArtifac.repositories.PropertyRepository;
import com.rear.rearArtifac.repositories.ReviewRepository;
import com.rear.rearArtifac.repositories.UsuarioRepository;

@DataJpaTest
@AutoConfigureTestDatabase( replace = Replace.NONE)
public class ReviewCrudTest {

    @Autowired
    private ReviewRepository ReviewRepo;

    @Autowired
    private UsuarioRepository userRepo;

    @Autowired
    private LessorRepository lssrRepo;

   @Autowired
    private PropertyRepository propRepo;

    Usuario usrCreated;
    Property propCreated;
    Review rvwCreated;
    
    @Test
    public void createReview ()throws Exception {

        System.out.println("#################################################################################");
        Long id = (long) 121212;
        String name = "Juan";
        String LastName = "Perez";
        String type = "CC";
        Long phone = (long) 312345678;
        String email = "correo@correo.com";


        Usuario usr = new Usuario(id, name, LastName, type,phone, email);
        //System.out.println(usr.toString());
        Usuario usrCreated = userRepo.save(usr);
        
        try {
            usrCreated = userRepo.save(usr);
            assertNotNull(usrCreated.getId_user());
            assertTrue(usrCreated.getId_user()> 0);
        } catch (Exception e){
            System.out.println(e);
        }
        System.out.println(usr.toString());

        Long idL = (long)123123;
        String fname = "kin";
        String lname = "Kong";
        String nacionalidad= "Colombia";
        String typeL = "CC";

        Lessor creado;

        Lessor lessor = new Lessor(idL,fname, lname,nacionalidad,typeL);
        try{
            creado = lssrRepo.save(lessor);
            assertNotNull(creado.getId_lessor());
            assertTrue(creado.getId_lessor()> 0);
            System.out.println("Se guardó exitosamente");
        }catch(Exception e){
            System.out.println(e);
        } 

        Property prop = new Property("city", "departamen", "address", usrCreated);
        Property propCreated = propRepo.save(prop);
        try {
            propCreated = propRepo.save(prop);
            assertNotNull(propCreated.getId_property());
            assertTrue(propCreated.getId_property()> 0);
        } catch (Exception e){
            System.out.println(e);
        }

        System.out.println("#################################################################################");
        //System.out.println(usr.toString());
        System.out.println(prop.toString());

        Review rvw = new Review(5, null, null, usrCreated, creado, propCreated);
        Review created = ReviewRepo.save(rvw);
        System.out.println(rvw.toString());
        assertNotNull(created.getId_review());
        assertTrue(created.getId_review()>0);
        //Review(5, 1999/10/10, 2000/10/10, usrCreated, propCreated,);

        //vamos a consultar registro
        Usuario usrSearched;
        Optional<Usuario> usrSearchedOptional = userRepo.findById(usrCreated.getId_user());
        assertTrue(usrSearchedOptional.isPresent());
        usrSearched = usrSearchedOptional.get();

        //Update user
        usrSearched.setPassword("admin1234");
        usrSearched.setFname("Jill");
        Usuario usrUpdated = userRepo.save(usrSearched);
        //test changes
        assertNotNull(usrUpdated.getId_user());
        assertTrue(usrUpdated.getId_user()> 0);
        assertEquals("admin1234", usrUpdated.getPassword());
        assertEquals("Jill",usrUpdated.getFname());
        System.out.println("###############################" + usrCreated.toString());

        ReviewRepo.flush();  //para limpiar caché
        

    }
}
 