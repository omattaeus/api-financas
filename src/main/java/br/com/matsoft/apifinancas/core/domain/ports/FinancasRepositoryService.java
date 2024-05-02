package br.com.matsoft.apifinancas.core.domain.ports;

import br.com.matsoft.apifinancas.core.domain.dtos.DespesasDTO;
import br.com.matsoft.apifinancas.core.domain.dtos.OrcamentosDTO;
import br.com.matsoft.apifinancas.core.domain.dtos.ReceitasDTO;

public interface FinancasRepositoryService {

    public DespesasDTO getByIdDespesas(Long id);
    public OrcamentosDTO getByIdOrcamentos(Long id);
    public ReceitasDTO getByIdReceitas(Long id);
    public DespesasDTO saveDespesas(DespesasDTO despesas);
    public OrcamentosDTO saveOrcamentos(OrcamentosDTO Orcamentos);
    public ReceitasDTO saveReceitas(ReceitasDTO Receitas);
    public Boolean doesFinancasNameExists(String name);
}