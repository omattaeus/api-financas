package br.com.matsoft.apifinancas.application.gateways;

import br.com.matsoft.apifinancas.adapters.persistence.OrcamentosEntity;
import br.com.matsoft.apifinancas.core.domain.dtos.OrcamentosDTO;
import br.com.matsoft.apifinancas.core.exception.FinancasAlreadyExists;

public interface CreateOrcamentosGateway {

    public OrcamentosDTO createOrcamento(OrcamentosDTO orcamentos) throws FinancasAlreadyExists;
    public OrcamentosEntity getByIdOrcamentos(Long id);

}
