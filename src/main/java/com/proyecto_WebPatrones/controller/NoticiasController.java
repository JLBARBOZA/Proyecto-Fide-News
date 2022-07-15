
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

@Controller
@Slf4j
public class NoticiasController {
    
    @GetMapping("/noticias_nacionales/noticiasNacionales")
    public String nacional(Model model){
 
        return "/noticias_nacionales/noticiasNacionales";
    }
    
    @GetMapping("/noticias_internacionales/noticiasInternacionales")
    public String internacional(Model model){
 
        return "/noticias_internacionales/noticiasInternacionales";
    }
    
}
