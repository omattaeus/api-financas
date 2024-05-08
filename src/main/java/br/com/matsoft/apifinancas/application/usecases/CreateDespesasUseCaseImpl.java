package br.com.matsoft.apifinancas.application.usecases;

import br.com.matsoft.apifinancas.adapters.persistence.DespesasEntity;
import br.com.matsoft.apifinancas.application.gateways.CreateDespesasGateways;
import br.com.matsoft.apifinancas.core.domain.dtos.DespesasDTO;
import br.com.matsoft.apifinancas.core.exception.FinancasAlreadyExists;
import br.com.matsoft.apifinancas.core.ports.FinancasRepositoryService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CreateDespesasUseCaseImpl implements CreateDespesasGateways {

    @Qualifier("createDespesasGateways")
    private final CreateDespesasGateways createDespesasGateways;
    @Qualifier("financasRepositoryService")
    private final FinancasRepositoryService financasRepositoryService;

    public CreateDespesasUseCaseImpl(CreateDespesasGateways createDespesasGateways, FinancasRepositoryService financasRepositoryService) {
        this.createDespesasGateways = createDespesasGateways;
        this.financasRepositoryService = financasRepositoryService;
    }

    @Override
    public DespesasDTO createDespesas(DespesasDTO despesas) throws FinancasAlreadyExists {
        if(financasRepositoryService.doesFinancasNameExists(despesas.nome()))
            throw new FinancasAlreadyExists();

        return createDespesasGateways.createDespesas(despesas);
    }

    @Override
    public DespesasEntity getByIdDespesas(Long id) {
        return createDespesasGateways.getByIdDespesas(id);
    }
}