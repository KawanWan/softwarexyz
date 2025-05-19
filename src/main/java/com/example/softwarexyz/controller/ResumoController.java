package com.example.softwarexyz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.softwarexyz.dto.ResumoDetalhadoDTO;
import com.example.softwarexyz.model.Resumo;
import com.example.softwarexyz.services.ResumoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/resumos")
public class ResumoController {

    @Autowired
    private ResumoService service;

    @GetMapping
    public List<ResumoDetalhadoDTO> listar() {
        return service.listar()
                      .stream()
                      .map(ResumoDetalhadoDTO::new)
                      .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Resumo> buscar(@PathVariable Long id) {
        return service.buscar(id)
                      .map(ResponseEntity::ok)
                      .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Resumo> salvar(@RequestBody Resumo resumo) {
        return ResponseEntity.ok(service.salvar(resumo));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}