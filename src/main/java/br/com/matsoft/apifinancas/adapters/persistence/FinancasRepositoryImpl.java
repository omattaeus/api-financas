package br.com.matsoft.apifinancas.adapters.persistence;

import br.com.matsoft.apifinancas.application.dtos.DespesasDTO;
import br.com.matsoft.apifinancas.application.dtos.OrcamentosDTO;
import br.com.matsoft.apifinancas.application.dtos.ReceitasDTO;
import org.springframework.stereotype.Repository;

@Repository
public class FinancasRepositoryImpl implements FinancasRepository{
    @Override
    public DespesasDTO saveDespesas(DespesasDTO despesas) {
        return null;
    }

    @Override
    public OrcamentosDTO saveOrcamentos(OrcamentosDTO orcamentos) {
        return null;
    }

    @Override
    public ReceitasDTO saveReceitas(ReceitasDTO receitas) {
        return null;
    }
}