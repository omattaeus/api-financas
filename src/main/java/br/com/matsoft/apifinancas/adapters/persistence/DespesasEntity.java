package br.com.matsoft.apifinancas.adapters.persistence;

import br.com.matsoft.apifinancas.core.domain.dtos.CategoriaDespesaDTO;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;

public class DespesasEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String descricao;
    private BigDecimal valor;
    private LocalDate data;
    private CategoriaDespesaDTO categoria;

    public DespesasEntity(){}

    public DespesasEntity(String nome, String descricao,
                          BigDecimal valor, LocalDate data,
                          CategoriaDespesaDTO categoria) {
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

    public CategoriaDespesaDTO getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaDespesaDTO categoria) {
        this.categoria = categoria;
    }
}