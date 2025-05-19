package com.example.softwarexyz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.softwarexyz.model.Agenda;

public interface AgendaRepository extends JpaRepository<Agenda, Long> {}