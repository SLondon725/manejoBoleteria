package com.manejoBoleteria.manejoBoleteria.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class LocalidadDetalle {
    @GeneratedValue long id;
    private double valor;
    private int cantidadDisponiible;
    private int localidad;
    private int evento;

}
