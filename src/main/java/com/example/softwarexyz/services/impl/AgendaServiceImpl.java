package com.example.softwarexyz.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.softwarexyz.model.Agenda;
import com.example.softwarexyz.repository.AgendaRepository;
import com.example.softwarexyz.repository.EspecializacaoRepository;
import com.example.softwarexyz.services.AgendaService;

import java.util.List;
import java.util.Optional;

@Service
public class AgendaServiceImpl implements AgendaService {

    @Autowired
    private AgendaRepository agendaRepository;

    @Autowired
    private EspecializacaoRepository especializacaoRepository;

    @Override
    public Agenda salvar(Agenda novaAgenda) {
        Long professorId = novaAgenda.getProfessor().getId();
        Long cursoId = novaAgenda.getCurso().getId();

        boolean especializado = especializacaoRepository.existsByProfessorIdAndCursoId(professorId, cursoId);
        if (!especializado) {
            throw new ResponseStatusException(
                HttpStatus.BAD_REQUEST,
                "O professor selecionado não é especializado neste curso."
            );
        }

        List<Agenda> conflitos = agendaRepository.verificarConflito(
            professorId,
            novaAgenda.getDataInicio(),
            novaAgenda.getDataFim()
        );

        if (!conflitos.isEmpty()) {
            throw new ResponseStatusException(
                HttpStatus.BAD_REQUEST,
                "O professor já está agendado nesse período."
            );
        }

        return agendaRepository.save(novaAgenda);
    }

    @Override
    public List<Agenda> listar() {
        return agendaRepository.findAll();
    }

    @Override
    public Optional<Agenda> buscar(Long id) {
        return agendaRepository.findById(id);
    }

    @Override
    public void deletar(Long id) {
        agendaRepository.deleteById(id);
    }
}