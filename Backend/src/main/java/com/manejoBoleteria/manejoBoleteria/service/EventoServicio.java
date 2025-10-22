package com.manejoBoleteria.manejoBoleteria.service;

import com.manejoBoleteria.manejoBoleteria.entidades.Evento;
import com.manejoBoleteria.manejoBoleteria.repositorio.EventoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.events.EventTarget;


import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class EventoServicio{


    private final EventoRepositorio eventoRepositorio;

    public EventoServicio(EventoRepositorio eventoRepositorio) {
        this.eventoRepositorio = eventoRepositorio;
    }


    public List<Evento> listar(){
        return eventoRepositorio.findAll();
    }

    public Optional<Evento> encontrarPorId(long id){
        return eventoRepositorio.findById(id);
    }

    public Evento registrarEvento(Evento evento) {
        Evento res;
        try {
            res = eventoRepositorio.save(evento);
        } catch (Exception err) {
            return null;
        }

        return res;
    }

    public Evento actualizarEvento(Evento evento){
        Evento res;
        try {
            res = eventoRepositorio.save(evento);
        } catch (Exception err) {
            return null;
        }

        return res;
    }
}
