package com.manejoBoleteria.manejoBoleteria.service;

import com.manejoBoleteria.manejoBoleteria.entidades.LocalidadDetalle;
import com.manejoBoleteria.manejoBoleteria.repositorio.LocalidadDetalleRepositorio;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/localidadDetalle")
public class LocalidadDetalleService {

    private final LocalidadDetalleRepositorio ldetalleRepo;


    public LocalidadDetalleService(LocalidadDetalleRepositorio ldetalleRepo) {
        this.ldetalleRepo = ldetalleRepo;
    }

    public List<LocalidadDetalle> listar(){
        return ldetalleRepo.findAll();
    }

    public Optional<LocalidadDetalle> encontrarPorId(long id){
        return ldetalleRepo.findById(id);
    }

    public LocalidadDetalle registrarLocalidadDetalle(LocalidadDetalle localidadDetalle) {
        LocalidadDetalle res;
        try {
            res = ldetalleRepo.save(localidadDetalle);
        } catch (Exception err) {
            return null;
        }

        return res;
    }

    public LocalidadDetalle actualizarLocalidadDetalle(LocalidadDetalle localidadDetalle){
        LocalidadDetalle res;
        try {
            res = ldetalleRepo.save(localidadDetalle);
        } catch (Exception err) {
            return null;
        }

        return res;
    }
}
