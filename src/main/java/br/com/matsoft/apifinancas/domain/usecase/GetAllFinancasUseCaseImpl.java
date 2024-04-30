package br.com.matsoft.apifinancas.domain.usecase;

import br.com.matsoft.apifinancas.domain.entities.Despesas;
import br.com.matsoft.apifinancas.domain.entities.Orcamentos;
import br.com.matsoft.apifinancas.domain.entities.Receitas;
import br.com.matsoft.apifinancas.domain.ports.FinancasRepositoryService;

import java.util.Collection;

public class GetAllFinancasUseCaseImpl implements GetAllFinancasUseCase{

    private final FinancasRepositoryService financasRepositoryService;

    public GetAllFinancasUseCaseImpl(FinancasRepositoryService financasRepositoryService) {
        this.financasRepositoryService = financasRepositoryService;
    }

    @Override
    public Collection<Despesas> getAllDespesas() {
        return financasRepositoryService.getAllDespesas();
    }

    @Override
    public Collection<Orcamentos> getAllOrcamentos() {
        return financasRepositoryService.getAllOrcamentos();
    }

    @Override
    public Collection<Receitas> getAllReceitas() {
        return financasRepositoryService.getAllReceitas();
    }
}