package br.com.matsoft.apifinancas.application.gateways;

import br.com.matsoft.apifinancas.adapters.persistence.ReceitasEntity;

public interface GetByIdReceitasGateways {

    public ReceitasEntity getByIdReceitas(Long id);
}