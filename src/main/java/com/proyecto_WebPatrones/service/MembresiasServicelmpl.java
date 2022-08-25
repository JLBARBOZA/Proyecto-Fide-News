/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto_WebPatrones.service;

import com.proyecto_WebPatrones.dao.MembresiasDao;
import com.proyecto_WebPatrones.domain.Membresias;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Lamec
 */
@Service
public class MembresiasServicelmpl implements MembresiasService {
    
    @Autowired
    private MembresiasDao membresiasDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Membresias> getMembresias() {
        return (List<Membresias>) membresiasDao.findAll();
    }

    @Override
    @Transactional
    public void save(Membresias membresias) {
        membresiasDao.save(membresias);
    }

    @Override
    @Transactional
    public void delete(Membresias membresias) {
        membresiasDao.delete(membresias);
    }

    @Override
    @Transactional(readOnly = true)
    public Membresias getMembresias(Membresias membresias) {
        return membresiasDao.findById(membresias.getIdMembresia()).orElse(null);
    }
    
}
