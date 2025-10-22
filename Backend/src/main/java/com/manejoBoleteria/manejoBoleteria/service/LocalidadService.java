package com.manejoBoleteria.manejoBoleteria.service;

import com.manejoBoleteria.manejoBoleteria.entidades.Localidad;
import com.manejoBoleteria.manejoBoleteria.entidades.LocalidadDetalle;
import com.manejoBoleteria.manejoBoleteria.repositorio.LocalidadRepositorio;

import java.util.List;
import java.util.Optional;

public class LocalidadService {

    private final LocalidadRepositorio localidadRepo;


    public LocalidadService(LocalidadRepositorio localidadRepo) {
        this.localidadRepo = localidadRepo;
    }

    public List<Localidad> listar(){
        return localidadRepo.findAll();
    }

    public Optional<Localidad> encontrarPorId(long id){
        return localidadRepo.findById(id);
    }

    public Localidad registrarLocalidad(Localidad localidad) {
        Localidad res;
        try {
            res = localidadRepo.save(localidad);
        } catch (Exception err) {
            return null;
        }

        return res;
    }

    public Localidad actualizarLocalidad(Localidad localidad){
        Localidad res;
        try {
            res = localidadRepo.save(localidad);
        } catch (Exception err) {
            return null;
        }

        return res;
    }
}
