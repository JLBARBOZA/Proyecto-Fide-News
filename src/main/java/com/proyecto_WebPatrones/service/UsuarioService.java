/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto_WebPatrones.service;

import com.proyecto_WebPatrones.domain.Usuario;
import java.util.List;

/**
 *
 * @author Lamec
 */
public interface UsuarioService {
    
    public List<Usuario> getUsuarios();
    
    public void save(Usuario usuario);
    
    public void delete(Usuario usuario);
    
    public Usuario getUsuario(Usuario usuario);    
    
    
}
