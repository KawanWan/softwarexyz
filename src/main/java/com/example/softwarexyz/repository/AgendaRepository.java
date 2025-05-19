package com.example.softwarexyz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.softwarexyz.model.Agenda;

import java.time.LocalDate;
import java.util.List;

public interface AgendaRepository extends JpaRepository<Agenda, Long> {

    @Query("""
        SELECT a FROM Agenda a 
        WHERE a.professor.id = :professorId
          AND (
            (:dataInicio BETWEEN a.dataInicio AND a.dataFim)
            OR (:dataFim BETWEEN a.dataInicio AND a.dataFim)
            OR (a.dataInicio BETWEEN :dataInicio AND :dataFim)
          )
    """)
    List<Agenda> verificarConflito(
        @Param("professorId") Long professorId,
        @Param("dataInicio") LocalDate dataInicio,
        @Param("dataFim") LocalDate dataFim
    );
}