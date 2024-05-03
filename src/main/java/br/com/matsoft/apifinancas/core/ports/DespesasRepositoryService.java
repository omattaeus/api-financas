package br.com.matsoft.apifinancas.core.ports;

import br.com.matsoft.apifinancas.adapters.persistence.DespesasEntity;
import br.com.matsoft.apifinancas.core.domain.dtos.DespesasDTO;

public interface DespesasRepositoryService {

    public DespesasEntity getByIdDespesas(Long id);
    public DespesasDTO saveDespesas(DespesasDTO despesas);

}
