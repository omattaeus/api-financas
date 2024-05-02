package br.com.matsoft.apifinancas.core.domain.dtos;

import java.math.BigDecimal;
import java.time.LocalDate;

public record DespesasDTO(String nome,
                          String descricao,
                          BigDecimal valor,
                          LocalDate data,
                          CategoriaDespesaDTO categoria) {
}