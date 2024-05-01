package br.com.matsoft.apifinancas.adapters.persistence;

import br.com.matsoft.apifinancas.application.dtos.DespesasDTO;
import br.com.matsoft.apifinancas.application.dtos.OrcamentosDTO;
import br.com.matsoft.apifinancas.application.dtos.ReceitasDTO;

public interface FinancasRepository {

    DespesasDTO saveDespesas(DespesasDTO despesas);
    OrcamentosDTO saveOrcamentos(OrcamentosDTO orcamentos);
    ReceitasDTO saveReceitas(ReceitasDTO receitas);
}
