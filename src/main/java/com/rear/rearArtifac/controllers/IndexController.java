package com.rear.rearArtifac.controllers;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

//import com.rear.rearArtifac.repositories.UsuarioRepository;
// Antes se instaló thymeleaf en pom.xml
@CrossOrigin //Para que realice los autowired correctamente
@Controller //decimos que esta clase es un controller
@RequestMapping("/") //mapeo de rutas donde se va a montar el controlador
public class IndexController {
    
    @RequestMapping(value = "/")
    public String index(){
        return "index"; //html que busca en templates Carpeta
    }
    
}
