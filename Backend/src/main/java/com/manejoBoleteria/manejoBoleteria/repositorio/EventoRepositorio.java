package com.manejoBoleteria.manejoBoleteria.repositorio;

import com.manejoBoleteria.manejoBoleteria.entidades.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoRepositorio extends JpaRepository<Evento, Long> {
}
