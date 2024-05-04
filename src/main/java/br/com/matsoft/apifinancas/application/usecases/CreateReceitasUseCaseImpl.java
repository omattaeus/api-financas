package br.com.matsoft.apifinancas.application.usecases;

import br.com.matsoft.apifinancas.application.gateways.CreateReceitasGateways;
import br.com.matsoft.apifinancas.core.domain.dtos.ReceitasDTO;
import br.com.matsoft.apifinancas.core.exception.FinancasAlreadyExists;
import br.com.matsoft.apifinancas.core.ports.FinancasRepositoryService;
import br.com.matsoft.apifinancas.core.ports.ReceitasRepositoryService;
import org.springframework.stereotype.Service;

@Service
public class CreateReceitasUseCaseImpl implements CreateReceitasGateways {

    private final ReceitasRepositoryService receitasRepositoryService;
    private final FinancasRepositoryService financasRepositoryService;

    public CreateReceitasUseCaseImpl(ReceitasRepositoryService receitasRepositoryService, FinancasRepositoryService financasRepositoryService) {
        this.receitasRepositoryService = receitasRepositoryService;
        this.financasRepositoryService = financasRepositoryService;
    }

    @Override
    public ReceitasDTO createReceitas(ReceitasDTO receitas) throws FinancasAlreadyExists {
        if(financasRepositoryService.doesFinancasNameExists(receitas.nome()))
            throw new FinancasAlreadyExists();

        return receitasRepositoryService.saveReceitas(receitas);
    }
}