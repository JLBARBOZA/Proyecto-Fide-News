/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto_WebPatrones.service;

import com.proyecto_WebPatrones.dao.AnunciosDao;
import com.proyecto_WebPatrones.domain.Anuncios;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Lamec
 */
@Service
public class AnunciosServicelmpl implements AnunciosService {
    
    @Autowired
    private AnunciosDao anunciosDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Anuncios> getAnuncios() {
        return (List<Anuncios>) anunciosDao.findAll();
    }

    @Override
    @Transactional
    public void save(Anuncios anuncios) {
        anunciosDao.save(anuncios);
    }

    @Override
    @Transactional
    public void delete(Anuncios anuncios) {
        anunciosDao.delete(anuncios);
    }

    @Override
    @Transactional(readOnly = true)
    public Anuncios getAnuncios(Anuncios anuncios) {
        return anunciosDao.findById(anuncios.getIdAnuncio()).orElse(null);
    }
    
}
