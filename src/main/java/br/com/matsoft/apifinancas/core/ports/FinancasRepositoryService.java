package br.com.matsoft.apifinancas.core.ports;

import br.com.matsoft.apifinancas.adapters.persistence.DespesasEntity;
import br.com.matsoft.apifinancas.adapters.persistence.OrcamentosEntity;
import br.com.matsoft.apifinancas.adapters.persistence.ReceitasEntity;
import br.com.matsoft.apifinancas.core.domain.dtos.DespesasDTO;
import br.com.matsoft.apifinancas.core.domain.dtos.OrcamentosDTO;
import br.com.matsoft.apifinancas.core.domain.dtos.ReceitasDTO;

public interface FinancasRepositoryService {

    public DespesasEntity getByIdDespesas(Long id);
    public OrcamentosEntity getByIdOrcamentos(Long id);
    public ReceitasEntity getByIdReceitas(Long id);
    public DespesasDTO saveDespesas(DespesasDTO despesas);
    public OrcamentosDTO saveOrcamentos(OrcamentosDTO Orcamentos);
    public ReceitasDTO saveReceitas(ReceitasDTO Receitas);
    public Boolean doesFinancasNameExists(String name);
}