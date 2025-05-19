package com.example.softwarexyz.services;

import java.util.List;
import java.util.Optional;

import com.example.softwarexyz.model.Professor;

public interface ProfessorService {
    Professor salvar(Professor p);
    List<Professor> listar();
    Optional<Professor> buscar(Long id);
    void deletar(Long id);
}