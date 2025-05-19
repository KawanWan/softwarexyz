package com.example.softwarexyz.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Especializacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Professor professor;

    @ManyToOne
    private Curso curso;
}