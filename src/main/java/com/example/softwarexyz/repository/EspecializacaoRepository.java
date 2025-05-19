package com.example.softwarexyz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.softwarexyz.model.Especializacao;

public interface EspecializacaoRepository extends JpaRepository<Especializacao, Long> {

    boolean existsByProfessorIdAndCursoId(Long professorId, Long cursoId);
}