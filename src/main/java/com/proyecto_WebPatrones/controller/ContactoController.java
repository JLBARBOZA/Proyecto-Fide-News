package com.proyecto_WebPatrones.controller;

import com.proyecto_WebPatrones.domain.Contacto;
import com.proyecto_WebPatrones.service.ContactoService;
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
public class ContactoController {

    @Autowired
    private ContactoService contactoservice;

    @GetMapping("/contacto/listado")
    public String inicio(Model model){

        var contactos = contactoservice.getContactos();

        model.addAttribute("contactos",contactos);
        return "/contacto/listado";
    }
    @GetMapping("/contacto/nuevo")
    public String nuevoContacto(Contacto contacto){
        return "contacto/modificar";
    }

    @PostMapping("/contacto/guardar")
    public String guardarContacto(Contacto contacto){
        contactoservice.save(contacto);
        return "redirect:/contacto/listado";
    }

    @GetMapping("/contacto/modificar/{idContacto}")
    public String modificarContacto(Contacto contacto, Model model){
        contacto=contactoservice.getContacto(contacto);
        model.addAttribute("contacto",contacto);
        return "contacto/modificar";
    }

    @GetMapping("/contacto/eliminar/{idContacto}")
    public String eliminarContacto(Contacto contacto){
        contactoservice.delete(contacto);
        return "redirect:/contacto/listado";
    }  


}