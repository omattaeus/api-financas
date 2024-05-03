package br.com.matsoft.apifinancas.application.usecases;

import br.com.matsoft.apifinancas.adapters.persistence.DespesasEntity;
import br.com.matsoft.apifinancas.application.gateways.GetByIdDespesasGateways;
import br.com.matsoft.apifinancas.core.ports.DespesasRepositoryService;

public class GetByIdDespesasUseCaseImpl implements GetByIdDespesasGateways {

    private final DespesasRepositoryService despesasRepositoryService;

    public GetByIdDespesasUseCaseImpl(DespesasRepositoryService despesasRepositoryService) {
        this.despesasRepositoryService = despesasRepositoryService;
    }

    @Override
    public DespesasEntity getByIdDespesas(Long id) {
        return despesasRepositoryService.getByIdDespesas(id);
    }
}
