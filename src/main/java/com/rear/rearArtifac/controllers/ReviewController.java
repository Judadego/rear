package com.rear.rearArtifac.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rear.rearArtifac.controllers.dto.ReviewCompletaDto;
import com.rear.rearArtifac.servicios.ReviewServicio;

@CrossOrigin // Para que realice los autowired correctamente
@Controller // decimos que esta clase es un controller
@RequestMapping("/rvw") // mapeo de rutas donde se va a montar el controlador
public class ReviewController {

    private ReviewServicio service;

    public ReviewController(ReviewServicio service) {
        super();
        this.service = service;
    }

    @ModelAttribute(value = "review")
    public ReviewCompletaDto retornarNuevoReviewRegistroDto(){
        return new ReviewCompletaDto() ;
    }

    @RequestMapping
    public String mostrarFormularioR() {
        return "resena";
    }
// pasar a otro controller
    /*@GetMapping("/listar")
    public String listar(Model model) {
        // Aqui queda pendiente por revisar si el resultado se dará en resultado.html o
        // en user.html
        List<Review> review = service.listarReviews();
        model.addAttribute("review", review);
        return "resultado";
    }*/

    @GetMapping
    public String mostrarFormularioDeRegistro(){
        return "resena";
    }

    @PostMapping
    public String registrarReview(@ModelAttribute("review") ReviewCompletaDto registroDto){
        service.guardar(registroDto);
        System.out.println("***12******************************");
        return "redirect:/rvw?exito";
    }

}
