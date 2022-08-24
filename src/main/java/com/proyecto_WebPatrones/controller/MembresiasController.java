/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.proyecto_WebPatrones.controller;

import com.proyecto_WebPatrones.domain.Membresias;
import com.proyecto_WebPatrones.service.MembresiasService;
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
public class MembresiasController {

    @Autowired
    private MembresiasService membresiasservice;
    
    @GetMapping("/membresias/listado")
    public String inicio(Model model){

        var membresias = membresiasservice.getMembresias();
        
        model.addAttribute("membresias",membresias);
        return "membresias/listado";
    }
    @GetMapping("/membresias/nuevo")
    public String nuevoMembresias(Membresias membresias){
        return "membresias/modificar";
    }
    
    @PostMapping("/membresias/guardar")
    public String guardarMembresias(Membresias membresias){
        membresiasservice.save(membresias);
        return "redirect:/membresias/listado";
    }
    
    @GetMapping("/membresias/modificar/{idMembresia}")
    public String modificarMembresias(Membresias membresias, Model model){
        membresias=membresiasservice.getMembresias(membresias);
        model.addAttribute("membresias",membresias);
        return "membresias/modificar";
    }
    
    @GetMapping("/membresias/eliminar/{idMembresia}")
    public String eliminarMembresias(Membresias membresias){
        membresiasservice.delete(membresias);
        return "redirect:/membresias/listado";
    }  
    
    
}
