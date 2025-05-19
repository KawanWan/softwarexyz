package com.example.softwarexyz.dto;

import com.example.softwarexyz.model.Resumo;

public class ResumoDetalhadoDTO {

    private Long id;
    private String descricao;

    private Long agendaId;
    private String dataInicio;
    private String dataFim;
    private String cidade;
    private String estado;

    private String curso;

    private String professor;

    public ResumoDetalhadoDTO(Resumo resumo) {
        this.id = resumo.getId();
        this.descricao = resumo.getDescricao();

        if (resumo.getAgenda() != null) {
            this.agendaId = resumo.getAgenda().getId();
            this.dataInicio = resumo.getAgenda().getDataInicio().toString();
            this.dataFim = resumo.getAgenda().getDataFim().toString();
            this.cidade = resumo.getAgenda().getCidade();
            this.estado = resumo.getAgenda().getEstado();

            if (resumo.getAgenda().getCurso() != null) {
                this.curso = resumo.getAgenda().getCurso().getDescricao();
            }

            if (resumo.getAgenda().getProfessor() != null) {
                this.professor = resumo.getAgenda().getProfessor().getNome();
            }
        }
    }

    public Long getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public Long getAgendaId() {
        return agendaId;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getCurso() {
        return curso;
    }

    public String getProfessor() {
        return professor;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setAgendaId(Long agendaId) {
        this.agendaId = agendaId;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }
}