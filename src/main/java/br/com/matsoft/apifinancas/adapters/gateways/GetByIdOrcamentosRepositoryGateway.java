package br.com.matsoft.apifinancas.adapters.gateways;

import br.com.matsoft.apifinancas.adapters.persistence.OrcamentosEntity;
import br.com.matsoft.apifinancas.adapters.persistence.OrcamentosRepository;
import br.com.matsoft.apifinancas.application.gateways.GetByIdOrcamentosGateways;

public class GetByIdOrcamentosRepositoryGateway implements GetByIdOrcamentosGateways {

    private final OrcamentosRepository orcamentosRepository;

    public GetByIdOrcamentosRepositoryGateway(OrcamentosRepository orcamentosRepository) {
        this.orcamentosRepository = orcamentosRepository;
    }


    @Override
    public OrcamentosEntity getByIdOrcamentos(Long id) {
        return orcamentosRepository.getReferenceById(id);
    }
}