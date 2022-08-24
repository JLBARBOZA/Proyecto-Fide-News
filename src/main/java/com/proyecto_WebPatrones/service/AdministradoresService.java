/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto_WebPatrones.service;

import com.proyecto_WebPatrones.domain.Administradores;
import java.util.List;

/**
 *
 * @author Lamec
 */
public interface AdministradoresService {
    
    public List<Administradores> getAdministradores();
    
    public void save(Administradores administradores);
    
    public void delete(Administradores administradores);
    
    public Administradores getAdministradores(Administradores administradores);    
    
    
}
