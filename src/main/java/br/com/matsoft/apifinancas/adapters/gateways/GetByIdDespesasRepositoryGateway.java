package br.com.matsoft.apifinancas.adapters.gateways;

import br.com.matsoft.apifinancas.adapters.persistence.DespesasEntity;
import br.com.matsoft.apifinancas.adapters.persistence.DespesasRepository;
import br.com.matsoft.apifinancas.application.gateways.GetByIdDespesasGateways;

public class GetByIdDespesasRepositoryGateway implements GetByIdDespesasGateways {

    private final DespesasRepository despesasRepository;

    public GetByIdDespesasRepositoryGateway(DespesasRepository despesasRepository) {
        this.despesasRepository = despesasRepository;
    }


    @Override
    public DespesasEntity getByIdDespesas(Long id) {
        return despesasRepository.getReferenceById(id);
    }
}