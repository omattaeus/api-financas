package br.com.matsoft.apifinancas.domain.entities;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Receitas {

    private Long id;
    private String nome;
    private String descricao;
    private BigDecimal valor;
    private LocalDate dataRecebimento;

    public Receitas(){}

    public Receitas(Long id, String nome, String descricao,
                    BigDecimal valor, LocalDate dataRecebimento) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.dataRecebimento = dataRecebimento;
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

    public LocalDate getDataRecebimento() {
        return dataRecebimento;
    }

    public void setDataRecebimento(LocalDate dataRecebimento) {
        this.dataRecebimento = dataRecebimento;
    }
}
