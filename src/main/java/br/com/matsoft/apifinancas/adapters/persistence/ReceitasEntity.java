package br.com.matsoft.apifinancas.adapters.persistence;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "receitas")
public class ReceitasEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    private String nome;
    @NotNull
    private String descricao;
    @NotNull
    private BigDecimal valor;
    @NotNull
    private LocalDate dataRecebimento;

    public ReceitasEntity(){}

    public ReceitasEntity(String nome, String descricao,
                          BigDecimal valor, LocalDate dataRecebimento) {
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
