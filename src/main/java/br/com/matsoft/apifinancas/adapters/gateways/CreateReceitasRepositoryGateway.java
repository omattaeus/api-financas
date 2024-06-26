package br.com.matsoft.apifinancas.adapters.gateways;

import br.com.matsoft.apifinancas.adapters.persistence.ReceitasEntity;
import br.com.matsoft.apifinancas.adapters.persistence.ReceitasRepository;
import br.com.matsoft.apifinancas.application.gateways.CreateReceitasGateways;
import br.com.matsoft.apifinancas.core.domain.dtos.ReceitasDTO;
import br.com.matsoft.apifinancas.core.exception.FinancasAlreadyExists;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CreateReceitasRepositoryGateway implements CreateReceitasGateways {

    @Qualifier("receitasRepository")
    private final ReceitasRepository receitasRepository;
    @Qualifier("receitasEntityMapper")
    private final ReceitasEntityMapper receitasEntityMapper;

    public CreateReceitasRepositoryGateway(ReceitasRepository receitasRepository,
                                           ReceitasEntityMapper receitasEntityMapper) {
        this.receitasRepository = receitasRepository;
        this.receitasEntityMapper = receitasEntityMapper;
    }

    @Override
    public ReceitasDTO createReceitas(ReceitasDTO receitasDomainObj) throws FinancasAlreadyExists {
        ReceitasEntity receitasEntity = receitasEntityMapper.toEntity(receitasDomainObj);
        ReceitasEntity savedObj = receitasRepository.save(receitasEntity);
        return receitasEntityMapper.toDomainObj(savedObj);
    }

    @Override
    public ReceitasEntity getByIdReceitas(Long id) {
        return receitasRepository.getReferenceById(id);
    }
}