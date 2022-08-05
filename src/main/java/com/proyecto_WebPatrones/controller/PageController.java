/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto_WebPatrones.controller;

import com.proyecto_WebPatrones.domain.Internacionales;
import com.proyecto_WebPatrones.service.InternacionalesService;
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
public class PageController {

    @Autowired
    private NacionalesService nacionalesservice;
    
    @GetMapping("/")
    public String inicio(Model model){

        var nacionales = nacionalesservice.getNacionales();
        
        model.addAttribute("nacionales",nacionales);
        return "noticias_nacionales/listado";
    }
    
    
    
}
