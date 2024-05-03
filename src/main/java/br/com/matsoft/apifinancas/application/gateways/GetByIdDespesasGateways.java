package br.com.matsoft.apifinancas.application.gateways;

import br.com.matsoft.apifinancas.adapters.persistence.DespesasEntity;

public interface GetByIdDespesasGateways {

    public DespesasEntity getByIdDespesas(Long id);
}