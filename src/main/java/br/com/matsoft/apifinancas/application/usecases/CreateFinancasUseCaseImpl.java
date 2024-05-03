package br.com.matsoft.apifinancas.application.usecases;

import br.com.matsoft.apifinancas.core.domain.dtos.DespesasDTO;
import br.com.matsoft.apifinancas.core.domain.dtos.OrcamentosDTO;
import br.com.matsoft.apifinancas.core.domain.dtos.ReceitasDTO;
import br.com.matsoft.apifinancas.core.exception.FinancasAlreadyExists;
import br.com.matsoft.apifinancas.core.ports.FinancasRepositoryService;
import br.com.matsoft.apifinancas.application.gateways.CreateFinancasGateways;
import org.springframework.stereotype.Component;

@Component
public class CreateFinancasUseCaseImpl implements CreateFinancasGateways {

    private final FinancasRepositoryService financasRepositoryService;

    public CreateFinancasUseCaseImpl(FinancasRepositoryService financasRepositoryService) {
        this.financasRepositoryService = financasRepositoryService;
    }

    @Override
    public ReceitasDTO createReceitas(ReceitasDTO receitas) throws FinancasAlreadyExists {

        if(financasRepositoryService.doesFinancasNameExists(receitas.nome()))
            throw new FinancasAlreadyExists();

        return financasRepositoryService.saveReceitas(receitas);
    }

    @Override
    public OrcamentosDTO createOrcamento(OrcamentosDTO orcamentos) throws FinancasAlreadyExists {

        if(financasRepositoryService.doesFinancasNameExists(orcamentos.nome()))
            throw new FinancasAlreadyExists();

        return financasRepositoryService.saveOrcamentos(orcamentos);
    }

    @Override
    public DespesasDTO createDespesas(DespesasDTO despesas) throws FinancasAlreadyExists {

        if(financasRepositoryService.doesFinancasNameExists(despesas.nome()))
            throw new FinancasAlreadyExists();

        return financasRepositoryService.saveDespesas(despesas);
    }
}