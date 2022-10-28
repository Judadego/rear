package com.rear.rearArtifac.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@CrossOrigin //Para que realice los autowired correctamente
@Controller //decimos que esta clase es un controller
@RequestMapping("/") //mapeo de rutas donde se va a montar el controlador
public class ReviewController {

    @RequestMapping(value = "/rvw")
    public String index(){
        return "resena";
    }
    
}
