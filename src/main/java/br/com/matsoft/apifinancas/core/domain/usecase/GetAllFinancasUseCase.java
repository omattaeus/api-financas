package br.com.matsoft.apifinancas.core.domain.usecase;

import br.com.matsoft.apifinancas.core.domain.entities.Despesas;
import br.com.matsoft.apifinancas.core.domain.entities.Orcamentos;
import br.com.matsoft.apifinancas.core.domain.entities.Receitas;

import java.util.Collection;

public interface GetAllFinancasUseCase {

    public Collection<Despesas> getAllDespesas();
    public Collection<Orcamentos> getAllOrcamentos();
    public Collection<Receitas> getAllReceitas();
}