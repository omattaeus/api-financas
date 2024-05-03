package br.com.matsoft.apifinancas.application.gateways;

import br.com.matsoft.apifinancas.core.domain.dtos.OrcamentosDTO;
import br.com.matsoft.apifinancas.core.exception.FinancasAlreadyExists;

public interface CreateOrcamentosGateway {

    OrcamentosDTO createOrcamento(OrcamentosDTO orcamentos) throws FinancasAlreadyExists;
}
