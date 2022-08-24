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
@Table(name="membresias")
public class Membresias implements Serializable {
    
//Para utilizar en la gneracion de la llave auto_increment
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMembresias;
    private String nombre;
    private String descripcion;

    public Membresias() {
    }

    public Membresias(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;

    }
}
