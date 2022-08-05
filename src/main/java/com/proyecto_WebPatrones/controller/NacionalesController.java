/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto_WebPatrones.controller;

import com.proyecto_WebPatrones.domain.Nacionales;
import com.proyecto_WebPatrones.service.NacionalesService;
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
public class NacionalesController {

    @Autowired
    private NacionalesService nacionalesservice;
    
    @GetMapping("/noticias_nacionales/listado")
    public String inicio(Model model){

        var nacionales = nacionalesservice.getNacionales();
        
        model.addAttribute("nacionales",nacionales);
        return "noticias_nacionales/listado";
    }
    @GetMapping("/noticias_nacionales/nuevo")
    public String nuevoNacionales(Nacionales nacionales){
        return "noticias_nacionales/modificar";
    }
    
    @PostMapping("/noticias_nacionales/guardar")
    public String guardarNacionales(Nacionales nacionales){
        nacionalesservice.save(nacionales);
        return "redirect:/noticias_nacionales/listado";
    }
    
    @GetMapping("/noticias_nacionales/modificar/{idNotinacional}")
    public String modificarNacionales(Nacionales nacionales, Model model){
        nacionales=nacionalesservice.getNacionales(nacionales);
        model.addAttribute("nacionales",nacionales);
        return "noticias_nacionales/modificar";
    }
    
    @GetMapping("/noticias_nacionales/eliminar/{idNotinacional}")
    public String eliminarNacionales(Nacionales nacionales){
        nacionalesservice.delete(nacionales);
        return "redirect:/noticias_nacionales/listado";
    }  
    
    
}
