package br.com.matsoft.apifinancas.application.gateways;

import br.com.matsoft.apifinancas.adapters.persistence.OrcamentosEntity;

public interface GetByIdOrcamentosGateways {

    public OrcamentosEntity getByIdOrcamentos(Long id);
}