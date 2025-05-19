package com.example.softwarexyz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.softwarexyz.dto.AgendaDTO;
import com.example.softwarexyz.model.Agenda;
import com.example.softwarexyz.services.AgendaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/agendas")
public class AgendaController {

    @Autowired
    private AgendaService service;

    @PostMapping
    public ResponseEntity<Agenda> salvar(@RequestBody Agenda a) {
        return ResponseEntity.ok(service.salvar(a));
    }

    @GetMapping
    public List<AgendaDTO> listar() {
        return service.listar().stream()
                .map(agenda -> {
                    AgendaDTO dto = new AgendaDTO();
                    dto.setId(agenda.getId());
                    dto.setDataInicio(agenda.getDataInicio());
                    dto.setDataFim(agenda.getDataFim());
                    dto.setHorarioInicio(agenda.getHorarioInicio());
                    dto.setHorarioFim(agenda.getHorarioFim());
                    dto.setCidade(agenda.getCidade());
                    dto.setEstado(agenda.getEstado());
                    dto.setCep(agenda.getCep());
                    dto.setEndereco(agenda.getEndereco());
                    dto.setCursoId(agenda.getCurso().getId());
                    dto.setProfessorId(agenda.getProfessor().getId());
                    return dto;
                })
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Agenda> buscar(@PathVariable Long id) {
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