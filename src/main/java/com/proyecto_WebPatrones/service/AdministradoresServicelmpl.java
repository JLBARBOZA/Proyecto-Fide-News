/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto_WebPatrones.service;

import com.proyecto_WebPatrones.dao.AdministradoresDao;
import com.proyecto_WebPatrones.domain.Administradores;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Lamec
 */
@Service
public class AdministradoresServicelmpl implements AdministradoresService {
    
    @Autowired
    private AdministradoresDao administradoresDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Administradores> getAdministradores() {
        return (List<Administradores>) administradoresDao.findAll();
    }

    @Override
    @Transactional
    public void save(Administradores administradores) {
        administradoresDao.save(administradores);
    }

    @Override
    @Transactional
    public void delete(Administradores administradores) {
        administradoresDao.delete(administradores);
    }

    @Override
    @Transactional(readOnly = true)
    public Administradores getAdministradores(Administradores administradores) {
        return administradoresDao.findById(administradores.getIdAdministrador()).orElse(null);
    }
    
}
