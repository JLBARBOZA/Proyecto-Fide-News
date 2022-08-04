/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto_WebPatrones.controller;

import com.proyecto_WebPatrones.domain.Internacionales;
import com.proyecto_WebPatrones.service.InternacionalesService;
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
public class InternacionalesController {

    @Autowired
    private InternacionalesService internacionalesservice;
    
    @GetMapping("/noticias_internacionales/listado")
    public String inicio(Model model){

        var internacionaless = internacionalesservice.getInternacionaless();
        
        model.addAttribute("internacionaless",internacionaless);
        return "noticias_internacionales/listado";
    }
    @GetMapping("/noticias_internacionales/nuevo")
    public String nuevoInternacionales(Internacionales internacionales){
        return "noticias_internacionales/modificar";
    }
    
    @PostMapping("/noticias_internacionales/guardar")
    public String guardarInternacionales(Internacionales internacionales){
        internacionalesservice.save(internacionales);
        return "redirect:/noticias_internacionales/listado";
    }
    
    @GetMapping("/noticias_internacionales/modificar/{id_notiinternacional}")
    public String modificarInternacionales(Internacionales internacionales, Model model){
        internacionales=internacionalesservice.getInternacionales(internacionales);
        model.addAttribute("internacionales",internacionales);
        return "internacionales/modificar";
    }
    
    @GetMapping("/noticias_internacionales/eliminar/{id_notiinterinternacionales}")
    public String eliminarInternacionales(Internacionales internacionales){
        internacionalesservice.delete(internacionales);
        return "redirect:/noticias_internacionales/listado";
    }  
    
    
}
