package br.com.matsoft.apifinancas.application.gateways;

import br.com.matsoft.apifinancas.core.domain.dtos.ReceitasDTO;
import br.com.matsoft.apifinancas.core.exception.FinancasAlreadyExists;

public interface CreateReceitasGateways {

    ReceitasDTO createReceitas(ReceitasDTO receitas) throws FinancasAlreadyExists;
}
