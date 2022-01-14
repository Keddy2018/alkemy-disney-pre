/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alkemypre.disney.entity;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author recos
 */
@Entity
@Getter
@Setter
@Table(name = "personaje")
public class PersonajeEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String imgaen;
    
    private String nombre;
    
    private char edad;
    
    private Float peso;
    
    private String historia;
    
    @ManyToMany(mappedBy = "personaje")
    private List<PeliculaYSerieEntity> peliculaYSerie;
}
