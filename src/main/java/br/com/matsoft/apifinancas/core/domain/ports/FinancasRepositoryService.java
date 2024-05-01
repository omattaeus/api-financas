package br.com.matsoft.apifinancas.core.domain.ports;

import br.com.matsoft.apifinancas.core.domain.entities.Receitas;
import br.com.matsoft.apifinancas.core.domain.entities.Despesas;
import br.com.matsoft.apifinancas.core.domain.entities.Orcamentos;

import java.util.Collection;

public interface FinancasRepositoryService {

    public Collection<Despesas> getAllDespesas();
    public Collection<Orcamentos> getAllOrcamentos();
    public Collection<Receitas> getAllReceitas();
    public void saveDespesas(Despesas despesas);
    public void saveOrcamentos(Orcamentos Orcamentos);
    public void saveReceitas(Receitas Receitas);
    public Boolean doesFinancasNameExists(String name);
}
