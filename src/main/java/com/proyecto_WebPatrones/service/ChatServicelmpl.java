/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto_WebPatrones.service;

import com.proyecto_WebPatrones.dao.ChatDao;
import com.proyecto_WebPatrones.domain.Chat;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Lamec
 */
@Service
public class ChatServicelmpl implements ChatService {
    
    @Autowired
    private ChatDao chatDao;
    


    @Override
    @Transactional(readOnly = true)
    public List<Chat> getChats() {
        return (List<Chat>) chatDao.findAll();
    }

    @Override
    @Transactional
    public void save(Chat chat) {
        chatDao.save(chat);
    }

    @Override
    @Transactional
    public void delete(Chat chat) {
        chatDao.delete(chat);
    }

    @Override
    @Transactional(readOnly = true)
    public Chat getChat(Chat chat) {
        return chatDao.findById(chat.getIdChat()).orElse(null);
    }
    
}
