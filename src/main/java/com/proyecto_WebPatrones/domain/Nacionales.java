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
@Table(name="nacionales")
public class Nacionales implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long idNotinacional;
    private String nombre;
    private String resumen;
    private String noticia;

    public Nacionales() {
    }

    public Nacionales(String nombre, String resumen, String noticia) {
        this.nombre = nombre;
        this.resumen = resumen;
        this.noticia = noticia;
    }
    
    
}
