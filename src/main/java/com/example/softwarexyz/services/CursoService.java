package com.example.softwarexyz.services;

import java.util.List;
import java.util.Optional;

import com.example.softwarexyz.model.Curso;

public interface CursoService {
    Curso salvar(Curso c);
    List<Curso> listar();
    Optional<Curso> buscar(Long id);
    void deletar(Long id);
}