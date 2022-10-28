package com.rear.rearArtifac.controllers;

//import org.springframework.ui.Model;

import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;

@CrossOrigin
@Controller
@RequestMapping("/")
public class UserController {

    
    @RequestMapping(value = "/usr")
    public String mapuser(/*@RequestParam(name="nameq", required=false, defaultValue = "hola")String nameq, Model model*/ ){
        return "user";
    }
}
