package br.com.matsoft.apifinancas.application.usecases;

import br.com.matsoft.apifinancas.adapters.persistence.ReceitasEntity;
import br.com.matsoft.apifinancas.application.gateways.CreateReceitasGateways;
import br.com.matsoft.apifinancas.core.domain.dtos.ReceitasDTO;
import br.com.matsoft.apifinancas.core.exception.FinancasAlreadyExists;
import br.com.matsoft.apifinancas.core.ports.FinancasRepositoryService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CreateReceitasUseCaseImpl implements CreateReceitasGateways {
    @Qualifier("createReceitasGateways")
    private final CreateReceitasGateways createReceitasGateways;
    @Qualifier("financasRepositoryService")
    private final FinancasRepositoryService financasRepositoryService;

    public CreateReceitasUseCaseImpl(CreateReceitasGateways createReceitasGateways, FinancasRepositoryService financasRepositoryService) {
        this.createReceitasGateways = createReceitasGateways;
        this.financasRepositoryService = financasRepositoryService;
    }

    @Override
    public ReceitasDTO createReceitas(ReceitasDTO receitas) throws FinancasAlreadyExists {
        if(financasRepositoryService.doesFinancasNameExists(receitas.nome()))
            throw new FinancasAlreadyExists();

        return createReceitasGateways.createReceitas(receitas);
    }

    @Override
    public ReceitasEntity getByIdReceitas(Long id) {
        return createReceitasGateways.getByIdReceitas(id);
    }
}