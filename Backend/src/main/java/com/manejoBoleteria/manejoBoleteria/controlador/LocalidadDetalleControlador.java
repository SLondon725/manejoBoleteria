package com.manejoBoleteria.manejoBoleteria.controlador;

import com.manejoBoleteria.manejoBoleteria.entidades.LocalidadDetalle;
import com.manejoBoleteria.manejoBoleteria.service.LocalidadDetalleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class LocalidadDetalleControlador {

    private LocalidadDetalleService loDetaService;

    @GetMapping
    public List<LocalidadDetalle> listarEventos(){
        return loDetaService.listar();
    }

    @PostMapping
    public LocalidadDetalle registrarLocalidadDetalle(@RequestBody LocalidadDetalle localidadDetalle){
        return loDetaService.registrarLocalidadDetalle(localidadDetalle);
    }
}
