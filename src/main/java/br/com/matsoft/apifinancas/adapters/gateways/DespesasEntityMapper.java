package br.com.matsoft.apifinancas.adapters.gateways;

import br.com.matsoft.apifinancas.adapters.persistence.DespesasEntity;
import br.com.matsoft.apifinancas.core.domain.dtos.DespesasDTO;

public class DespesasEntityMapper {

    DespesasEntity toEntity(DespesasDTO despesasDomainObj){
        return new DespesasEntity(despesasDomainObj.nome(), despesasDomainObj.descricao(),
                                despesasDomainObj.valor(), despesasDomainObj.data(),
                                despesasDomainObj.categoria());
    }

    DespesasDTO toDomainObj(DespesasEntity despesasEntity){
        return new DespesasDTO(despesasEntity.getNome(), despesasEntity.getDescricao(),
                despesasEntity.getValor(), despesasEntity.getData(), despesasEntity.getCategoria());
    }
}
