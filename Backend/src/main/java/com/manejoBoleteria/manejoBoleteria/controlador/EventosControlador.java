package com.manejoBoleteria.manejoBoleteria.controlador;


import com.manejoBoleteria.manejoBoleteria.entidades.Evento;
import com.manejoBoleteria.manejoBoleteria.service.EventoServicio;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/eventos")
public class EventosControlador {

    private EventoServicio eventoServicio;

    @GetMapping
    public List<Evento> listarEventos(){
        return eventoServicio.listar();
    }

    @PostMapping
    public Evento registrar(@RequestBody Evento evento){
        return eventoServicio.registrarEvento(evento);
    }



}
