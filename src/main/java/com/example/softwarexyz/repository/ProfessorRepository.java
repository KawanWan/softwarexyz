package com.example.softwarexyz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.softwarexyz.model.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {}