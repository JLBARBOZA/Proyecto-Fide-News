/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto_WebPatrones.service;

import com.proyecto_WebPatrones.domain.Contacto;
import java.util.List;

/**
 *
 * @author Lamec
 */
public interface ContactoService {
    
    public List<Contacto> getContactos();
    
    public void save(Contacto contacto);
    
    public void delete(Contacto contacto);
    
    public Contacto getContacto(Contacto contacto);    
    
    
}
