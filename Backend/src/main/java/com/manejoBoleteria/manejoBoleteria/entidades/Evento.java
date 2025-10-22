package com.manejoBoleteria.manejoBoleteria.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Evento {
    @GeneratedValue Long id;
    private String nombre;
    private String descripcion;
    private String fecha_inicio;
    private String horario_inicio;
    private String fecha_fin;
    private String horario_fin;
    private String lugarRealizacion;
    private String departamento;
    private String municipio;

}
