package com.proyecto_WebPatrones.controller;

import com.proyecto_WebPatrones.domain.Chat;
import com.proyecto_WebPatrones.service.ChatService;
import lombok.extern.slf4j.Slf4j;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *ff
 * @author Lamec
 */
@Controller
@Slf4j
public class ChatController {
    @Autowired
    private ChatService chatservice;

    @GetMapping("/chat/listado")
    public String inicio(Model model){

        var chats = chatservice.getChats();

        model.addAttribute("chats",chats);
        return "/chat/listado";
    }
    @GetMapping("/chat/nuevo")
    public String nuevoChat(Chat chat){
        return "chat/modificar";
    }

    @PostMapping("/chat/guardar")
    public String guardarChat(Chat chat){
        chatservice.save(chat);
        return "redirect:/chat/listado";
    }

    @GetMapping("/chat/modificar/{idChat}")
    public String modificarChat(Chat chat, Model model){
        chat=chatservice.getChat(chat);
        model.addAttribute("chat",chat);
        return "chat/modificar";
    }

    @GetMapping("/chat/eliminar/{idChat}")
    public String eliminarChat(Chat chat){
        chatservice.delete(chat);
        return "redirect:/chat/listado";
    }  


}