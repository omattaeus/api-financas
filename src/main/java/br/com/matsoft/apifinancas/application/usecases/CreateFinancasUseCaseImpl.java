package br.com.matsoft.apifinancas.application.usecases;

import br.com.matsoft.apifinancas.core.domain.entities.Despesas;
import br.com.matsoft.apifinancas.core.domain.entities.Orcamentos;
import br.com.matsoft.apifinancas.core.domain.entities.Receitas;
import br.com.matsoft.apifinancas.core.domain.exception.FinancasAlreadyExists;
import br.com.matsoft.apifinancas.core.domain.ports.FinancasRepositoryService;
import br.com.matsoft.apifinancas.core.domain.usecase.CreateFinancasUseCase;
import org.springframework.stereotype.Service;

@Service
public class CreateFinancasUseCaseImpl implements CreateFinancasUseCase {

    private final FinancasRepositoryService financasRepositoryService;

    public CreateFinancasUseCaseImpl(FinancasRepositoryService financasRepositoryService) {
        this.financasRepositoryService = financasRepositoryService;
    }

    @Override
    public void createReceitas(Receitas receitas) throws FinancasAlreadyExists {

        if(financasRepositoryService.doesFinancasNameExists(receitas.getNome()))
            throw new FinancasAlreadyExists();

        financasRepositoryService.saveReceitas(receitas);
    }

    @Override
    public void createOrcamento(Orcamentos orcamentos) throws FinancasAlreadyExists {

        if(financasRepositoryService.doesFinancasNameExists(orcamentos.getNome()))
            throw new FinancasAlreadyExists();

        financasRepositoryService.saveOrcamentos(orcamentos);
    }

    @Override
    public void createDespesas(Despesas despesas) throws FinancasAlreadyExists {

        if(financasRepositoryService.doesFinancasNameExists(despesas.getNome()))
            throw new FinancasAlreadyExists();

        financasRepositoryService.saveDespesas(despesas);
    }
}