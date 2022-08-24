/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.proyecto_WebPatrones.controller;

import com.proyecto_WebPatrones.domain.Anuncios;
import com.proyecto_WebPatrones.service.AnunciosService;
import lombok.extern.slf4j.Slf4j;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Lamec
 */
@Controller
@Slf4j
public class AnunciosController {

    @Autowired
    private AnunciosService anunciosservice;
    
    @GetMapping("/anuncios/listado")
    public String inicio(Model model){

        var anuncios = anunciosservice.getAnuncios();
        
        model.addAttribute("anuncios",anuncios);
        return "anuncios/listado";
    }
    @GetMapping("/anuncios/nuevo")
    public String nuevoAnuncios(Anuncios anuncios){
        return "noticias_anuncios/modificar";
    }
    
    @PostMapping("/anuncios/guardar")
    public String guardarAnuncios(Anuncios anuncios){
        anunciosservice.save(anuncios);
        return "redirect:/anuncios/listado";
    }
    
    @GetMapping("/anuncios/modificar/{idAnuncio}")
    public String modificarAnuncios(Anuncios anuncios, Model model){
        anuncios=anunciosservice.getAnuncios(anuncios);
        model.addAttribute("anuncios",anuncios);
        return "anuncios/modificar";
    }
    
    @GetMapping("/anuncios/eliminar/{idAnuncio}")
    public String eliminarAnuncios(Anuncios anuncios){
        anunciosservice.delete(anuncios);
        return "redirect:/anuncios/listado";
    }  
    
    
}
