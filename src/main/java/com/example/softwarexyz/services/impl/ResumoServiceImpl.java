package com.example.softwarexyz.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.softwarexyz.model.Resumo;
import com.example.softwarexyz.repository.ResumoRepository;
import com.example.softwarexyz.services.ResumoService;

import java.util.List;
import java.util.Optional;

@Service
public class ResumoServiceImpl implements ResumoService {

    @Autowired
    private ResumoRepository repository;

    public Resumo salvar(Resumo r) {
        return repository.save(r);
    }

    public List<Resumo> listar() {
        return repository.findAll();
    }

    public Optional<Resumo> buscar(Long id) {
        return repository.findById(id);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}