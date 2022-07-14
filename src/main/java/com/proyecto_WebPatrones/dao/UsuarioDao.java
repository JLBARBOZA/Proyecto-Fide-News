/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto_WebPatrones.dao;

import com.proyecto_WebPatrones.domain.Usuario;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Lamec
 */
public interface UsuarioDao extends CrudRepository<Usuario, Long> {
    
}
