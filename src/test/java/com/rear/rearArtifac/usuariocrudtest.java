package com.rear.rearArtifac;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

//import static org.junit.jupiter.api.Assertions.assertNotNull;

//import java.util.List;
//import java.util.Optional;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.*;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

//import com.rear.rearArtifac.repositories.UsuarioRepository;

import com.rear.rearArtifac.entities.*;
import com.rear.rearArtifac.repositories.UsuarioRepository;

@DataJpaTest
@AutoConfigureTestDatabase( replace = Replace.NONE)
public class usuariocrudtest {
   @Autowired
    private UsuarioRepository UsrRepo;

    Usuario usrCreated;

    @Test
    public void createUser(){

        Long id = (long) 121212;
        String name = "Juan";
        String LastName = "Perez";
        String type = "CC";
        Long phone = (long) 312345678;
        String email = "correo@correo.com";

        Usuario result;

        Usuario usr = new Usuario(id, name, LastName, type, phone, email);
        try {
            result = UsrRepo.save(usr);
            assertNotNull(result.getId_user());
            assertTrue(result.getId_user()> 0);
            System.out.println("Se guardó exitosamente");
        } catch (Exception e){
            System.out.println(e);
        }
        /* 
        System.out.println("#################################################################################");
        Usuario usr = new Usuario(152416488, "Julian", "derk", "cc", 03131222, "hsadjisd", "fdsfjdasfsd");
        //System.out.println(usr.toString());
        Usuario usrCreated = UsrRepo.save(usr);
        assertNotNull(usrCreated.getId_user());
        assertTrue(usrCreated.getId_user()> 0);
        
    }

    @Test
    public void updateUser(){
/*
        String newFname = "Jill";
        String newPass = "Admin1234";

        //creat user
        System.out.println("#################################################################################");
        Usuario usr = new Usuario(152416488, "Julian", "derk", "cc", 03131222, "hsadjisd", "fdsfjdasfsd");
        Usuario usrCreated = UsrRepo.save(usr);
        
        //vamos a consultar registro
        Usuario usrSearched;
        Optional<Usuario> usrSearchedOptional = UsrRepo.findById(usrCreated.getId_user());
        assertTrue(usrSearchedOptional.isPresent());
        usrSearched = usrSearchedOptional.get();

        //Update user
        usrSearched.setPassword(newPass);
        usrSearched.setFname(newFname);
        Usuario usrUpdated = UsrRepo.save(usrSearched);
        //test changes
        assertNotNull(usrUpdated.getId_user());
        assertTrue(usrUpdated.getId_user()> 0);
        assertEquals(newPass, usrUpdated.getPassword());
        assertEquals(newFname,usrUpdated.getFname());
        System.out.println("###############################" + usrCreated.toString());

        //Para actualizar toca buscar el repositories o entityManager
        //
    }

    @Test
    public void deleteUser(){
         //creat user
         System.out.println("#################################################################################");
         Usuario usr = new Usuario(152416488, "Julian", "derk", "cc", 03131222, "hsadjisd", "fdsfjdasfsd");
         Usuario usrCreated = UsrRepo.save(usr);
         
         //vamos a consultar registro
         Usuario usrSearched;
         Optional<Usuario> usrSearchedOptional = UsrRepo.findById(usrCreated.getId_user());
         assertTrue(usrSearchedOptional.isPresent());
         usrSearched = usrSearchedOptional.get();
 
         //Delete user
         UsrRepo.delete(usrSearched);
         //test correct delete
         usrSearchedOptional = UsrRepo.findById(usrCreated.getId_user());
         assertFalse(usrSearchedOptional.isPresent());
        
         //log
         System.out.println("###############################" + usrSearchedOptional.toString());
    }

    /*@Test
    public void findAllUsers(){
        //creat user
        System.out.println("#################################################################################");
        Usuario usr1 = new Usuario(1052416488, "Julian1", "derk", "cc", 03131222, "hsadjisd", "fdsfjdasfsd");
        Usuario usrCreated1 = UsrRepo.save(usr1);

        //creat user
        System.out.println("#################################################################################");
        Usuario usr2 = new Usuario(1152416488, "Julian2", "derk", "cc", 03131222, "hsadjisd", "fdsfjdasfsd");
        Usuario usrCreated2 = UsrRepo.save(usr2);

        //creat user
        System.out.println("#################################################################################");
        Usuario usr3 = new Usuario(1252416488, "Julian3", "derk", "cc", 03131222, "hsadjisd", "fdsfjdasfsd");
        Usuario usrCreated3 = UsrRepo.save(usr3);

        //find all 
        List<Usuario> usrs = UsrRepo.findAll();
        assertTrue(usrs.size() > 0);
    */
    }
    
    
}
