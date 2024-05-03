package br.com.matsoft.apifinancas.core.ports;

import br.com.matsoft.apifinancas.adapters.persistence.ReceitasEntity;
import br.com.matsoft.apifinancas.core.domain.dtos.ReceitasDTO;

public interface ReceitasRepositoryService {

    public ReceitasEntity getByIdReceitas(Long id);
    public ReceitasDTO saveReceitas(ReceitasDTO Receitas);

}
