package com.rear.rearArtifac.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

//import org.springframework.ui.Model;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rear.rearArtifac.Util.PageRender;
import com.rear.rearArtifac.entities.Lessor;
import com.rear.rearArtifac.entities.Review;
import com.rear.rearArtifac.servicios.LessorServicio;
import com.rear.rearArtifac.servicios.ReviewServicio;

@CrossOrigin
@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    private ReviewServicio rvwServicio;

    @Autowired
    private LessorServicio lssrService;
    
    /*@RequestMapping(value = "/usr1")
    public String listarArrendatario(Model modelo){
        List<Lessor> listarArrendatario = lssrServiceImp.listarArrendatario();
        modelo.addAttribute("listarArrendatario", listarArrendatario);
        return "user";
    }*/

    @RequestMapping(value = "/usr")
    public String listarReviews(Model modelo){
        List<Review> listarReviews = rvwServicio.listarReviews();
        List<Lessor> listarLessor = lssrService.listarArrendatario();

        // listarReviews = rvwServicio.listarReviews();
        modelo.addAttribute("listarReviews", listarReviews);
        modelo.addAttribute("listarLessor", listarLessor);
        System.out.println("Ruta return de reviews ___________________________________________________________________________________________________________________________________________________________________________");
        return "user";
    }

    // @GetMapping(value = "/listar")
    // public String listarReview (@RequestParam(name = "page", defaultValue = "0" ) int page, Model modelo){
    //     Pageable pageRequest = PageRequest.of(page,5);
    //     Page<Review> reviews = rvwServicio.findAll(pageRequest);
    //     PageRender<Review> PageRender = new PageRender<>("/lista", reviews);

    //     modelo.addAttribute("titulo", "Listado de reviews");
    //     modelo.addAttribute("reviews", reviews);
    //     modelo.addAttribute("page", PageRender);
    //     return "user";
    // }


}
