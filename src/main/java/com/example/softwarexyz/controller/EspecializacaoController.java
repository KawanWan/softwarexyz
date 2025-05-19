package com.example.softwarexyz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.softwarexyz.model.Especializacao;
import com.example.softwarexyz.repository.EspecializacaoRepository;

import java.util.List;

@RestController
@RequestMapping("/especializacoes")
public class EspecializacaoController {

    @Autowired
    private EspecializacaoRepository repository;

    @PostMapping
    public ResponseEntity<Especializacao> salvar(@RequestBody Especializacao e) {
        return ResponseEntity.ok(repository.save(e));
    }

    @GetMapping
    public List<Especializacao> listar() {
        return repository.findAll();
    }
}