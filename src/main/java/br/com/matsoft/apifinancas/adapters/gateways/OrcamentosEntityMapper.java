package br.com.matsoft.apifinancas.adapters.gateways;

import br.com.matsoft.apifinancas.adapters.persistence.OrcamentosEntity;
import br.com.matsoft.apifinancas.core.domain.dtos.OrcamentosDTO;

public class OrcamentosEntityMapper {

    OrcamentosEntity toEntity(OrcamentosDTO orcamentosDomainObj){
        return new OrcamentosEntity(orcamentosDomainObj.nome(), orcamentosDomainObj.descricao(),
                orcamentosDomainObj.valorTotal(), orcamentosDomainObj.dataInicio(),
                orcamentosDomainObj.dataFim());
    }

    OrcamentosDTO toDomainObj(OrcamentosEntity orcamentosEntity){
        return new OrcamentosDTO(orcamentosEntity.getNome(), orcamentosEntity.getDescricao(),
                orcamentosEntity.getValorTotal(), orcamentosEntity.getDataInicio(),
                orcamentosEntity.getDataFim());
    }
}
