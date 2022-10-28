package com.rear.rearArtifac.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rear.rearArtifac.controllers.dto.UsuarioRegistroDto;
import com.rear.rearArtifac.servicios.UsuarioServicio;

@Controller 
@RequestMapping(value = "/registro")
public class RegistroUsuarioController {
    
    private UsuarioServicio usrServicio;

    public RegistroUsuarioController(UsuarioServicio usrServicio) {
        super();
        this.usrServicio = usrServicio;
    }

    @ModelAttribute(value = "usuario")
    public UsuarioRegistroDto retornarNuevoUsuarioRegistroDto(){
        return new UsuarioRegistroDto() ;
    }

    @GetMapping
    public String mostrarFormularioDeRegistro(){
        return "registro";
    }

    @PostMapping
    public String registrarCuentaDeUsuario(@ModelAttribute("usuario") UsuarioRegistroDto registroDto){
        usrServicio.guardar(registroDto);
        return "redirect:/registro?exito";
    }


}
