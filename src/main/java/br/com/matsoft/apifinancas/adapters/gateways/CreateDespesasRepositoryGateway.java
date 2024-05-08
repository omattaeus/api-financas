package br.com.matsoft.apifinancas.adapters.gateways;

import br.com.matsoft.apifinancas.adapters.persistence.DespesasEntity;
import br.com.matsoft.apifinancas.adapters.persistence.DespesasRepository;
import br.com.matsoft.apifinancas.application.gateways.CreateDespesasGateways;
import br.com.matsoft.apifinancas.core.domain.dtos.DespesasDTO;
import br.com.matsoft.apifinancas.core.exception.FinancasAlreadyExists;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CreateDespesasRepositoryGateway implements CreateDespesasGateways {

    @Qualifier("despesasRepository")
    private final DespesasRepository despesasRepository;
    @Qualifier("despesasEntityMapper")
    private final DespesasEntityMapper despesasEntityMapper;

    public CreateDespesasRepositoryGateway(DespesasRepository despesasRepository,
                                           DespesasEntityMapper despesasEntityMapper) {
        this.despesasRepository = despesasRepository;
        this.despesasEntityMapper = despesasEntityMapper;
    }

    @Override
    public DespesasDTO createDespesas(DespesasDTO despesasDomainObj) throws FinancasAlreadyExists {
        DespesasEntity despesasEntity = despesasEntityMapper.toEntity(despesasDomainObj);
        DespesasEntity savedObj = despesasRepository.save(despesasEntity);
        return despesasEntityMapper.toDomainObj(savedObj);
    }

    @Override
    public DespesasEntity getByIdDespesas(Long id) {
        return despesasRepository.getReferenceById(id);
    }
}