package br.com.matsoft.apifinancas.application.usecases;

import br.com.matsoft.apifinancas.core.domain.entities.Despesas;
import br.com.matsoft.apifinancas.core.domain.entities.Orcamentos;
import br.com.matsoft.apifinancas.core.domain.entities.Receitas;
import br.com.matsoft.apifinancas.core.domain.ports.FinancasRepositoryService;
import br.com.matsoft.apifinancas.core.domain.usecase.GetAllFinancasUseCase;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class GetAllFinancasUseCaseImpl implements GetAllFinancasUseCase {

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
