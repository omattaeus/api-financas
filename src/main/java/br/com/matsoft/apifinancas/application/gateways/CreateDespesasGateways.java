package br.com.matsoft.apifinancas.application.gateways;

import br.com.matsoft.apifinancas.core.domain.dtos.DespesasDTO;
import br.com.matsoft.apifinancas.core.exception.FinancasAlreadyExists;

public interface CreateDespesasGateways {

    DespesasDTO createDespesas(DespesasDTO despesas) throws FinancasAlreadyExists;
}
