/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto_WebPatrones.service;

import com.proyecto_WebPatrones.dao.NacionalesDao;
import com.proyecto_WebPatrones.domain.Nacionales;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Lamec
 */
@Service
public class NacionalesServicelmpl implements NacionalesService {
    
    @Autowired
    private NacionalesDao nacionalesDao;
    


    @Override
    @Transactional(readOnly = true)
    public List<Nacionales> getNacionaless() {
        return (List<Nacionales>) nacionalesDao.findAll();
    }

    @Override
    @Transactional
    public void save(Nacionales nacionales) {
        nacionalesDao.save(nacionales);
    }

    @Override
    @Transactional
    public void delete(Nacionales nacionales) {
        nacionalesDao.delete(nacionales);
    }

    @Override
    @Transactional(readOnly = true)
    public Nacionales getNacionales(Nacionales nacionales) {
        return nacionalesDao.findById(nacionales.getIdNotinacionales()).orElse(null);
    }
    
}
