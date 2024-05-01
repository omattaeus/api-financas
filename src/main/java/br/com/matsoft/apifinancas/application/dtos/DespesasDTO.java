package br.com.matsoft.apifinancas.application.dtos;

import br.com.matsoft.apifinancas.core.domain.entities.CategoriaDespesa;

import java.math.BigDecimal;
import java.time.LocalDate;

public record DespesasDTO(String nome,
                          String descricao,
                          BigDecimal valor,
                          LocalDate data,
                          CategoriaDespesa categoria) {
}
