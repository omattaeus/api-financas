package br.com.matsoft.apifinancas.adapters.controllers.mapper;

import br.com.matsoft.apifinancas.adapters.controllers.CreateOrcamentoRequest;
import br.com.matsoft.apifinancas.adapters.controllers.CreateOrcamentoResponse;
import br.com.matsoft.apifinancas.core.domain.dtos.OrcamentosDTO;

public class OrcamentosMapper {

    public CreateOrcamentoResponse toResponse(OrcamentosDTO orcamentosDTO){
        return new CreateOrcamentoResponse(orcamentosDTO.nome(), orcamentosDTO.descricao(),
                orcamentosDTO.valorTotal(), orcamentosDTO.dataInicio(), orcamentosDTO.dataFim());
    }

    public OrcamentosDTO toOrcamentos(CreateOrcamentoRequest request){
        return new OrcamentosDTO(request.nome(), request.descricao(), request.valorTotal(),
                request.dataInicio(), request.dataFim());
    }
}