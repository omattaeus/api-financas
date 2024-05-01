package br.com.matsoft.apifinancas.core.domain.usecase;

import br.com.matsoft.apifinancas.core.domain.entities.Despesas;
import br.com.matsoft.apifinancas.core.domain.entities.Receitas;
import br.com.matsoft.apifinancas.core.domain.entities.Orcamentos;
import br.com.matsoft.apifinancas.core.domain.exception.FinancasAlreadyExists;

public interface CreateFinancasUseCase {

    void createReceitas(Receitas receitas) throws FinancasAlreadyExists;
    void createOrcamento(Orcamentos orcamentos) throws FinancasAlreadyExists;
    void createDespesas(Despesas despesas) throws FinancasAlreadyExists;
}