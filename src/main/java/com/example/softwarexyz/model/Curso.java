package com.example.softwarexyz.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Data
public class Curso {
    @Id
    @GeneratedValue
    private Long id;
    private String descricao;
    private Integer cargaHoraria;
    private String objetivo;
    private String ementa;

    @OneToMany(mappedBy = "curso")
    private List<Agenda> agendas;

}