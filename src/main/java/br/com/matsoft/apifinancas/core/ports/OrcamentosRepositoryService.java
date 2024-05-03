package br.com.matsoft.apifinancas.core.ports;

import br.com.matsoft.apifinancas.adapters.persistence.OrcamentosEntity;
import br.com.matsoft.apifinancas.core.domain.dtos.OrcamentosDTO;

public interface OrcamentosRepositoryService {

    public OrcamentosEntity getByIdOrcamentos(Long id);
    public OrcamentosDTO saveOrcamentos(OrcamentosDTO Orcamentos);
}
