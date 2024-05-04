package br.com.matsoft.apifinancas.application.usecases;

import br.com.matsoft.apifinancas.adapters.persistence.OrcamentosEntity;
import br.com.matsoft.apifinancas.application.gateways.GetByIdOrcamentosGateways;
import br.com.matsoft.apifinancas.core.ports.OrcamentosRepositoryService;
import org.springframework.stereotype.Service;

@Service
public class GetByIdOrcamentosUseCaseImpl implements GetByIdOrcamentosGateways {

    private final OrcamentosRepositoryService orcamentosRepositoryService;

    public GetByIdOrcamentosUseCaseImpl(OrcamentosRepositoryService orcamentosRepositoryService) {
        this.orcamentosRepositoryService = orcamentosRepositoryService;
    }

    @Override
    public OrcamentosEntity getByIdOrcamentos(Long id) {
        return orcamentosRepositoryService.getByIdOrcamentos(id);
    }
}