package com.example.softwarexyz.services;

import java.util.List;
import java.util.Optional;

import com.example.softwarexyz.model.Resumo;

public interface ResumoService {
    Resumo salvar(Resumo r);
    List<Resumo> listar();
    Optional<Resumo> buscar(Long id);
    void deletar(Long id);
}