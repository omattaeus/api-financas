package br.com.matsoft.apifinancas.adapters.controllers;

import br.com.matsoft.apifinancas.core.domain.dtos.CategoriaDespesaDTO;

import java.math.BigDecimal;
import java.time.LocalDate;

public record CreateDespesasResponse(String nome,
                                     String descricao,
                                     BigDecimal valor,
                                     LocalDate data,
                                     CategoriaDespesaDTO categoria) {
}