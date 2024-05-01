package br.com.matsoft.apifinancas.core.domain.entities;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Orcamentos {

    private Long id;
    private String nome;
    private String descricao;
    private BigDecimal valorTotal;
    private LocalDate dataInicio;
    private LocalDate dataFim;

    public Orcamentos() {}

    public Orcamentos(Long id, String nome, String descricao,
                      BigDecimal valorTotal, LocalDate dataInicio,
                      LocalDate dataFim) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.valorTotal = valorTotal;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
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
}
