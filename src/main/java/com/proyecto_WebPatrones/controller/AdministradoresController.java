/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.proyecto_WebPatrones.controller;

import com.proyecto_WebPatrones.domain.Administradores;
import com.proyecto_WebPatrones.service.AdministradoresService;
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
public class AdministradoresController {

    @Autowired
    private AdministradoresService administradoresservice;
    
    @GetMapping("/administradores/listado")
    public String inicio(Model model){

        var administradores = administradoresservice.getAdministradores();
        
        model.addAttribute("administradores",administradores);
        return "administradores/listado";
    }
    @GetMapping("/administradores/nuevo")
    public String nuevoAdministradores(Administradores administradores){
        return "administradores/modificar";
    }
    
    @PostMapping("/administradores/guardar")
    public String guardarAdministradores(Administradores administradores){
        administradoresservice.save(administradores);
        return "redirect:/administradores/listado";
    }
    
    @GetMapping("/administradores/modificar/{idAdministrador}")
    public String modificarAdministradores(Administradores administradores, Model model){
        administradores=administradoresservice.getAdministradores(administradores);
        model.addAttribute("administradores",administradores);
        return "administradores/modificar";
    }
    
    @GetMapping("/administradores/eliminar/{idAdministrador}")
    public String eliminarAdministradores(Administradores administradores){
        administradoresservice.delete(administradores);
        return "redirect:/administradores/listado";
    }  
    
    
}
