package br.com.matsoft.apifinancas.application.usecases;

import br.com.matsoft.apifinancas.adapters.persistence.DespesasEntity;
import br.com.matsoft.apifinancas.application.gateways.CreateDespesasGateways;
import br.com.matsoft.apifinancas.core.domain.dtos.DespesasDTO;
import br.com.matsoft.apifinancas.core.exception.FinancasAlreadyExists;
import br.com.matsoft.apifinancas.core.ports.DespesasRepositoryService;
import br.com.matsoft.apifinancas.core.ports.FinancasRepositoryService;
import org.springframework.stereotype.Service;

@Service
public class CreateDespesasUseCaseImpl implements CreateDespesasGateways {

    private final DespesasRepositoryService despesasRepositoryService;
    private final FinancasRepositoryService financasRepositoryService;

    public CreateDespesasUseCaseImpl(DespesasRepositoryService despesasRepositoryService,
                                     FinancasRepositoryService financasRepositoryService) {
        this.despesasRepositoryService = despesasRepositoryService;
        this.financasRepositoryService = financasRepositoryService;
    }

    @Override
    public DespesasDTO createDespesas(DespesasDTO despesas) throws FinancasAlreadyExists {
        if(financasRepositoryService.doesFinancasNameExists(despesas.nome()))
            throw new FinancasAlreadyExists();

        return despesasRepositoryService.saveDespesas(despesas);
    }

    @Override
    public DespesasEntity getByIdDespesas(Long id) {
        return despesasRepositoryService.getByIdDespesas(id);
    }
}