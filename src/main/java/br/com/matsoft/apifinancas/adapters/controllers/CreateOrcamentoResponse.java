package br.com.matsoft.apifinancas.adapters.controllers;

import java.math.BigDecimal;
import java.time.LocalDate;

public record CreateOrcamentoResponse(String nome,
                                      String descricao,
                                      BigDecimal valorTotal,
                                      LocalDate dataInicio,
                                      LocalDate dataFim) {
}
