/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto_WebPatrones.service;

import com.proyecto_WebPatrones.domain.Internacionales;
import java.util.List;

/**
 *
 * @author Lamec
 */
public interface InternacionalesService {
    
    public List<Internacionales> getInternacionaless();
    
    public void save(Internacionales internacionales);
    
    public void delete(Internacionales internacionales);
    
    public Internacionales getInternacionales(Internacionales internacionales);    
    
    
}
