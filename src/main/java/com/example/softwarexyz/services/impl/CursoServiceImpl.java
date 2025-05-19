package com.example.softwarexyz.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.softwarexyz.model.Curso;
import com.example.softwarexyz.repository.CursoRepository;
import com.example.softwarexyz.services.CursoService;

import java.util.List;
import java.util.Optional;

@Service
public class CursoServiceImpl implements CursoService {

    @Autowired
    private CursoRepository repository;

    public Curso salvar(Curso c) {
        return repository.save(c);
    }

    public List<Curso> listar() {
        return repository.findAll();
    }

    public Optional<Curso> buscar(Long id) {
        return repository.findById(id);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}