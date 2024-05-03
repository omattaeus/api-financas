package br.com.matsoft.apifinancas.application.usecases;

import br.com.matsoft.apifinancas.adapters.persistence.DespesasEntity;
import br.com.matsoft.apifinancas.adapters.persistence.OrcamentosEntity;
import br.com.matsoft.apifinancas.adapters.persistence.ReceitasEntity;
import br.com.matsoft.apifinancas.core.ports.FinancasRepositoryService;
import br.com.matsoft.apifinancas.application.gateways.GetByIdFinancasGateways;
import org.springframework.stereotype.Component;

@Component
public class GetByIdFinancasUseCaseImpl implements GetByIdFinancasGateways {

    private final FinancasRepositoryService financasRepositoryService;

    public GetByIdFinancasUseCaseImpl(FinancasRepositoryService financasRepositoryService) {
        this.financasRepositoryService = financasRepositoryService;
    }

    @Override
    public OrcamentosEntity getByIdOrcamentos(Long id) {
        return financasRepositoryService.getByIdOrcamentos(id);
    }

    @Override
    public ReceitasEntity getByIdReceitas(Long id) {
        return financasRepositoryService.getByIdReceitas(id);
    }

    @Override
    public DespesasEntity getByIdDespesas(Long id) {
        return financasRepositoryService.getByIdDespesas(id);
    }
}