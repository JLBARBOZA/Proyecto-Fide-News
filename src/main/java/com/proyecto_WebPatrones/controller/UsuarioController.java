/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto_WebPatrones.controller;

import com.proyecto_WebPatrones.domain.Usuario;
import com.proyecto_WebPatrones.service.UsuarioService;
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
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioservice;
    
    @GetMapping("/")
    public String inicio(Model model){

        var usuarios = usuarioservice.getUsuarios();
        
        model.addAttribute("usuarios",usuarios);
        return "index";
    }
    @GetMapping("/usuario/nuevo")
    public String nuevoUsuario(Usuario usuario){
        return "usuario/registro";
    }
    
    @PostMapping("/usuario/guardar")
    public String guardarUsuario(Usuario usuario){
        usuarioservice.save(usuario);
        return "redirect:/";
    }
    
    @GetMapping("/usuario/registro/{idUsuario}")
    public String modificarUsuario(Usuario usuario, Model model){
        usuario=usuarioservice.getUsuario(usuario);
        model.addAttribute("usuario",usuario);
        return "usuario/registro";
    }
    
    @GetMapping("/usuario/eliminar/{idUsuario}")
    public String eliminarUsuario(Usuario usuario){
        usuarioservice.delete(usuario);
        return "redirect:/";
    }  
    
    
}
