/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto_WebPatrones.service;

import com.proyecto_WebPatrones.domain.Chat;
import java.util.List;

/**
 *
 * @author Lamec
 */
public interface ChatService {
    
    public List<Chat> getChats();
    
    public void save(Chat chat);
    
    public void delete(Chat chat);
    
    public Chat getChat(Chat chat);    
    
    
}
