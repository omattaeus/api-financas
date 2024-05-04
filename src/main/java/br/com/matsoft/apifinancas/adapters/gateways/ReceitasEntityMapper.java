package br.com.matsoft.apifinancas.adapters.gateways;

import br.com.matsoft.apifinancas.adapters.persistence.ReceitasEntity;
import br.com.matsoft.apifinancas.core.domain.dtos.ReceitasDTO;

public class ReceitasEntityMapper {

    ReceitasEntity toEntity(ReceitasDTO receitasDomainObj){
        return new ReceitasEntity(receitasDomainObj.nome(), receitasDomainObj.descricao(),
                receitasDomainObj.valor(), receitasDomainObj.dataRecebimento());
    }

    ReceitasDTO toDomainObj(ReceitasEntity receitasEntity){
        return new ReceitasDTO(receitasEntity.getNome(), receitasEntity.getDescricao(),
                receitasEntity.getValor(), receitasEntity.getDataRecebimento());
    }
}