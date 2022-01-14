/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alkemypre.disney.entity;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author recos
 */
@Entity
@Getter
@Setter
@Table(name = "pelicula")
public class PeliculaYSerieEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String imagen;
    
    private String titulo;
    
    @Column(name = "fecha_creacion")
    @DateTimeFormat(pattern = "DD/MM/AAAA")
    private LocalDate fechaCreacion;
    
    private char calificacion;
    
    @ManyToMany
    @JoinTable(name = "personaje_pelicula")
    private List<PersonajeEntity> personaje;
    
    @ManyToOne
    @JoinColumn(name = "genero_de_peli")
    private GeneroEntity genero;
    
    
    
    
    
    
}


