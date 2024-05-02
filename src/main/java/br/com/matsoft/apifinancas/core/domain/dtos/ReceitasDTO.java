package br.com.matsoft.apifinancas.core.domain.dtos;

import java.math.BigDecimal;
import java.time.LocalDate;

public record ReceitasDTO(
        String nome,
                          String descricao,
                          BigDecimal valor,
                          LocalDate dataRecebimento) {
}
