package com.rear.rearArtifac.controllers;

import org.springframework.beans.factory.annotation.Autowired;

//import com.rear.rearArtifac.entities.Usuario;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;

//import org.springframework.web.bind.annotation.PostMapping;

//import org.springframework.web.bind.annotation.RequestMethod;

import com.rear.rearArtifac.servicios.UsuarioServicio;
//@CrossOrigin //Para que realice los autowired correctamente
@Controller //decimos que esta clase es un controller
//@RequestMapping("/registro") //mapeo de rutas donde se va a montar el controlador
public class RegistroController {
    
    @Autowired 
    private UsuarioServicio usrServicio;
    
    @GetMapping("/login")
    public String iniciarSesion(){
        return "index";
    }

    @GetMapping("/")
    public String verPaginaDeInicio(Model modelo){
        //modelo.addAttribute("usuario", usrServicio.listarUsuarios());
        return "user";
    }
}
