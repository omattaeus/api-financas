package br.com.matsoft.apifinancas.adapters.controllers.mapper;

import br.com.matsoft.apifinancas.adapters.controllers.CreateDespesasRequest;
import br.com.matsoft.apifinancas.adapters.controllers.CreateDespesasResponse;
import br.com.matsoft.apifinancas.adapters.controllers.CreateReceitasRequest;
import br.com.matsoft.apifinancas.adapters.controllers.CreateReceitasResponse;
import br.com.matsoft.apifinancas.core.domain.dtos.DespesasDTO;
import br.com.matsoft.apifinancas.core.domain.dtos.ReceitasDTO;

public class ReceitasMapper {

    public CreateReceitasResponse toResponse(ReceitasDTO receitasDTO){
        return new CreateReceitasResponse(receitasDTO.nome(), receitasDTO.descricao(),
                receitasDTO.valor(), receitasDTO.dataRecebimento());
    }

    public ReceitasDTO toReceitas(CreateReceitasRequest request){
        return new ReceitasDTO(request.nome(), request.descricao(), request.valor(),
                request.dataRecebimento());
    }
}
