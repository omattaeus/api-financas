package br.com.matsoft.apifinancas.adapters.controllers;

import java.math.BigDecimal;
import java.time.LocalDate;

public record CreateReceitasResponse(String nome,
                                     String descricao,
                                     BigDecimal valor,
                                     LocalDate dataRecebimento) {
}
