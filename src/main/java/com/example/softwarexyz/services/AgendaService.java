package com.example.softwarexyz.services;

import java.util.List;
import java.util.Optional;

import com.example.softwarexyz.model.Agenda;

public interface AgendaService {
    Agenda salvar(Agenda a);
    List<Agenda> listar();
    Optional<Agenda> buscar(Long id);
    void deletar(Long id);
}