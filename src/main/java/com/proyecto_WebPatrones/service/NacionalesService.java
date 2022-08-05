/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto_WebPatrones.service;

import com.proyecto_WebPatrones.domain.Nacionales;
import java.util.List;

/**
 *
 * @author Lamec
 */
public interface NacionalesService {
    
    public List<Nacionales> getNacionales();
    
    public void save(Nacionales nacionales);
    
    public void delete(Nacionales nacionales);
    
    public Nacionales getNacionales(Nacionales nacionales);    
    
    
}
