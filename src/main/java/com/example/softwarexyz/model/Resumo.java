package com.example.softwarexyz.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Resumo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;

    @OneToOne(mappedBy = "resumo")
    private Agenda agenda;
}