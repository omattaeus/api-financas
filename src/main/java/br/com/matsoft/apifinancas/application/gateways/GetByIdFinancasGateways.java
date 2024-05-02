package br.com.matsoft.apifinancas.application.gateways;

import br.com.matsoft.apifinancas.adapters.persistence.DespesasEntity;
import br.com.matsoft.apifinancas.adapters.persistence.OrcamentosEntity;
import br.com.matsoft.apifinancas.adapters.persistence.ReceitasEntity;

public interface GetByIdFinancasGateways {

    public OrcamentosEntity getByIdOrcamentos(Long id);
    public ReceitasEntity getByIdReceitas(Long id);
    public DespesasEntity getByIdDespesas(Long id);
}