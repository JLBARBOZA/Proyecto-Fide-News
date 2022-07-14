/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto_WebPatrones.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Lamec
 */
@Data
@Entity
@Table(name="usuario")
public class Usuario implements Serializable {
    
//Para utilizar en la gneracion de la llave auto_increment
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;
    private String nombre;
    private String email;
    private String contraseña;
    private String region;
    private int edad;

    public Usuario() {
    }

    public Usuario(String nombre, String email, String contraseña, int edad) {
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
        this.edad = edad;
    }
}
