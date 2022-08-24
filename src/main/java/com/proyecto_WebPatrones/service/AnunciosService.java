/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto_WebPatrones.service;

import com.proyecto_WebPatrones.domain.Anuncios;
import java.util.List;

/**
 *
 * @author Lamec
 */
public interface AnunciosService {
    
    public List<Anuncios> getAnuncios();
    
    public void save(Anuncios anuncios);
    
    public void delete(Anuncios anuncios);
    
    public Anuncios getAnuncios(Anuncios anuncios);    
    
    
}
