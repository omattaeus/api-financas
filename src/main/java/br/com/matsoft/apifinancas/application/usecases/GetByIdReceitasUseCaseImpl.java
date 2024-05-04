package br.com.matsoft.apifinancas.application.usecases;

import br.com.matsoft.apifinancas.adapters.persistence.ReceitasEntity;
import br.com.matsoft.apifinancas.application.gateways.GetByIdReceitasGateways;
import br.com.matsoft.apifinancas.core.ports.ReceitasRepositoryService;
import org.springframework.stereotype.Service;

@Service
public class GetByIdReceitasUseCaseImpl implements GetByIdReceitasGateways {

    private final ReceitasRepositoryService receitasRepositoryService;

    public GetByIdReceitasUseCaseImpl(ReceitasRepositoryService receitasRepositoryService) {
        this.receitasRepositoryService = receitasRepositoryService;
    }

    @Override
    public ReceitasEntity getByIdReceitas(Long id) {
        return receitasRepositoryService.getByIdReceitas(id);

    }
}