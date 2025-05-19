package com.example.softwarexyz.dto;

import java.time.LocalDate;
import java.time.LocalTime;

public class AgendaDTO {
    private Long id;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private LocalTime horarioInicio;
    private LocalTime horarioFim;
    private String cidade;
    private String estado;
    private String cep;
    private String endereco;
    private Long cursoId;
    private Long professorId;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public LocalDate getDataInicio() {
        return dataInicio;
    }
    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }
    public LocalDate getDataFim() {
        return dataFim;
    }
    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }
    public LocalTime getHorarioInicio() {
        return horarioInicio;
    }
    public void setHorarioInicio(LocalTime horarioInicio) {
        this.horarioInicio = horarioInicio;
    }
    public LocalTime getHorarioFim() {
        return horarioFim;
    }
    public void setHorarioFim(LocalTime horarioFim) {
        this.horarioFim = horarioFim;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public Long getCursoId() {
        return cursoId;
    }
    public void setCursoId(Long cursoId) {
        this.cursoId = cursoId;
    }
    public Long getProfessorId() {
        return professorId;
    }
    public void setProfessorId(Long professorId) {
        this.professorId = professorId;
    }
}
