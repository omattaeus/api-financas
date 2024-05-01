package br.com.matsoft.apifinancas.application.dtos;

import java.math.BigDecimal;
import java.time.LocalDate;

public record OrcamentosDTO(String nome,
                            String descricao,
                            BigDecimal valorTotal,
                            LocalDate dataInicio,
                            LocalDate dataFim) {
}
