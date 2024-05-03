package br.com.matsoft.apifinancas.application.usecases;

import br.com.matsoft.apifinancas.adapters.persistence.OrcamentosEntity;
import br.com.matsoft.apifinancas.core.domain.dtos.OrcamentosDTO;

public interface OrcamentosRepositoryService {

    public OrcamentosEntity getByIdOrcamentos(Long id);
    public OrcamentosDTO saveOrcamentos(OrcamentosDTO Orcamentos);
}
