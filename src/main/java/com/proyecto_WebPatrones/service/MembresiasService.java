/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto_WebPatrones.service;

import com.proyecto_WebPatrones.domain.Membresias;
import java.util.List;

/**
 *
 * @author Lamec
 */
public interface MembresiasService {
    
    public List<Membresias> getMembresias();
    
    public void save(Membresias membresias);
    
    public void delete(Membresias membresias);
    
    public Membresias getMembresias(Membresias membresias);    
    
    
}
