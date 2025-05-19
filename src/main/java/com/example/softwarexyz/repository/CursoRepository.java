package com.example.softwarexyz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.softwarexyz.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {}