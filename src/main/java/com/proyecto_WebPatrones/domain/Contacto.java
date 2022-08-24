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
@Table(name="contacto")
public class Contacto implements Serializable {
    
//Para utilizar en la gneracion de la llave auto_increment
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContacto;
    private String nombre;
    private String informacion;
    private String facebook;
    private String email;

    public Contacto() {
    }

    public Contacto(String nombre, String informacion, String facebook, String email) {
        this.nombre = nombre;
        this.informacion = informacion;
        this.facebook = facebook;
        this.email = email;
    }

    
}
