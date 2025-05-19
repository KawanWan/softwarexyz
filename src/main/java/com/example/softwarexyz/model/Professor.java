package com.example.softwarexyz.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Data
public class Professor {
    @Id @GeneratedValue
    private Long id;
    private String nome;
    private String cpf;
    private String r;
    private String endereco;
    private String celular;

    @OneToMany(mappedBy = "professor")
    private List<Agenda> agendas;
}