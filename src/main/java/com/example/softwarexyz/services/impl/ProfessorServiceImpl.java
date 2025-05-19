package com.example.softwarexyz.services.impl;

import com.example.softwarexyz.model.Professor;
import com.example.softwarexyz.repository.ProfessorRepository;
import com.example.softwarexyz.services.ProfessorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfessorServiceImpl implements ProfessorService {

    @Autowired
    private ProfessorRepository repository;

    public Professor salvar(Professor p) {
        return repository.save(p);
    }

    public List<Professor> listar() {
        return repository.findAll();
    }

    public Optional<Professor> buscar(Long id) {
        return repository.findById(id);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}