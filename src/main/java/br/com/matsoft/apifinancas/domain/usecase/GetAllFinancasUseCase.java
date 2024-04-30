package br.com.matsoft.apifinancas.domain.usecase;

import br.com.matsoft.apifinancas.domain.entities.Despesas;
import br.com.matsoft.apifinancas.domain.entities.Orcamentos;
import br.com.matsoft.apifinancas.domain.entities.Receitas;

import java.util.Collection;

public interface GetAllFinancasUseCase {

    public Collection<Despesas> getAllDespesas();
    public Collection<Orcamentos> getAllOrcamentos();
    public Collection<Receitas> getAllReceitas();
}
