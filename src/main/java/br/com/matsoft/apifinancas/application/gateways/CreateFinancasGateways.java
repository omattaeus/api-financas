package br.com.matsoft.apifinancas.application.gateways;

import br.com.matsoft.apifinancas.core.domain.dtos.DespesasDTO;
import br.com.matsoft.apifinancas.core.domain.dtos.OrcamentosDTO;
import br.com.matsoft.apifinancas.core.domain.dtos.ReceitasDTO;
import br.com.matsoft.apifinancas.core.domain.exception.FinancasAlreadyExists;

public interface CreateFinancasGateways {

    ReceitasDTO createReceitas(ReceitasDTO receitas) throws FinancasAlreadyExists;

    OrcamentosDTO createOrcamento(OrcamentosDTO orcamentos) throws FinancasAlreadyExists;

    DespesasDTO createDespesas(DespesasDTO despesas) throws FinancasAlreadyExists;
}