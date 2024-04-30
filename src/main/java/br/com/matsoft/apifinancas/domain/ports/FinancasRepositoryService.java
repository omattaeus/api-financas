package br.com.matsoft.apifinancas.domain.ports;

import br.com.matsoft.apifinancas.domain.entities.Despesas;
import br.com.matsoft.apifinancas.domain.entities.Orcamentos;
import br.com.matsoft.apifinancas.domain.entities.Receitas;

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
