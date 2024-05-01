package br.com.matsoft.apifinancas.core.domain.entities;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Despesas {

    private Long id;
    private String nome;
    private String descricao;
    private BigDecimal valor;
    private LocalDate data;
    private CategoriaDespesa categoria;

    public Despesas(){}

    public Despesas(Long id, String nome, String descricao, BigDecimal valor,
                    LocalDate data, CategoriaDespesa categoria) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.data = data;
        this.categoria = categoria;
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

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public CategoriaDespesa getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaDespesa categoria) {
        this.categoria = categoria;
    }
}
