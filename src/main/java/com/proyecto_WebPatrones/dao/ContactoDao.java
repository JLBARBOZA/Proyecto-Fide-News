/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto_WebPatrones.dao;

import com.proyecto_WebPatrones.domain.Contacto;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Lamec
 */
public interface ContactoDao extends CrudRepository<Contacto, Long> {
    
}
