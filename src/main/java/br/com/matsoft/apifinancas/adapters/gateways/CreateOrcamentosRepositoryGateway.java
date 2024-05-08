package br.com.matsoft.apifinancas.adapters.gateways;

import br.com.matsoft.apifinancas.adapters.persistence.OrcamentosEntity;
import br.com.matsoft.apifinancas.adapters.persistence.OrcamentosRepository;
import br.com.matsoft.apifinancas.application.gateways.CreateOrcamentosGateway;
import br.com.matsoft.apifinancas.core.domain.dtos.OrcamentosDTO;
import br.com.matsoft.apifinancas.core.exception.FinancasAlreadyExists;

public class CreateOrcamentosRepositoryGateway implements CreateOrcamentosGateway {

    private final OrcamentosRepository orcamentosRepository;
    private final OrcamentosEntityMapper orcamentosEntityMapper;

    public CreateOrcamentosRepositoryGateway(OrcamentosRepository orcamentosRepository, OrcamentosEntityMapper orcamentosEntityMapper) {
        this.orcamentosRepository = orcamentosRepository;
        this.orcamentosEntityMapper = orcamentosEntityMapper;
    }


    @Override
    public OrcamentosDTO createOrcamento(OrcamentosDTO orcamentosDomainObj) throws FinancasAlreadyExists {
        OrcamentosEntity orcamentosEntity = orcamentosEntityMapper.toEntity(orcamentosDomainObj);
        OrcamentosEntity savedObj = orcamentosRepository.save(orcamentosEntity);
        return orcamentosEntityMapper.toDomainObj(savedObj);
    }

    @Override
    public OrcamentosEntity getByIdOrcamentos(Long id) {
        return orcamentosRepository.getReferenceById(id);
    }
}