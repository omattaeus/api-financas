package br.com.matsoft.apifinancas.adapters.controllers.mapper;

import br.com.matsoft.apifinancas.adapters.controllers.CreateDespesasRequest;
import br.com.matsoft.apifinancas.adapters.controllers.CreateDespesasResponse;
import br.com.matsoft.apifinancas.core.domain.dtos.DespesasDTO;

public class DespesasMapper {

    public CreateDespesasResponse toResponse(DespesasDTO despesasDTO){
        return new CreateDespesasResponse(despesasDTO.nome(), despesasDTO.descricao(),
        despesasDTO.valor(), despesasDTO.data(), despesasDTO.categoria());
    }

    public DespesasDTO toDespesas(CreateDespesasRequest request){
        return new DespesasDTO(request.nome(), request.descricao(), request.valor(),
                request.data(), request.categoria());
    }
}
