package com.manejoBoleteria.manejoBoleteria.entidades;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Localidad {
    @GeneratedValue Long id;
    private String nombre;
}
