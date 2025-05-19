package com.example.softwarexyz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.softwarexyz.model.Professor;
import com.example.softwarexyz.services.ProfessorService;

import java.util.List;

@RestController
@RequestMapping("/professores")
public class ProfessorController {

    @Autowired
    private ProfessorService service;

    @PostMapping
    public ResponseEntity<Professor> salvar(@RequestBody Professor p) {
        return ResponseEntity.ok(service.salvar(p));
    }

    @GetMapping
    public List<Professor> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Professor> buscar(@PathVariable Long id) {
        return service.buscar(id)
                      .map(ResponseEntity::ok)
                      .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}