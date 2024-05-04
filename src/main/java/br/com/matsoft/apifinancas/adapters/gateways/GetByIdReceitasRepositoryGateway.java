package br.com.matsoft.apifinancas.adapters.gateways;

import br.com.matsoft.apifinancas.adapters.persistence.ReceitasEntity;
import br.com.matsoft.apifinancas.adapters.persistence.ReceitasRepository;
import br.com.matsoft.apifinancas.application.gateways.GetByIdReceitasGateways;

public class GetByIdReceitasRepositoryGateway implements GetByIdReceitasGateways {

    private final ReceitasRepository receitasRepository;

    public GetByIdReceitasRepositoryGateway(ReceitasRepository receitasRepository) {
        this.receitasRepository = receitasRepository;
    }


    @Override
    public ReceitasEntity getByIdReceitas(Long id) {
        return receitasRepository.getReferenceById(id);
    }
}