package br.com.matsoft.apifinancas.adapters.controllers;

import br.com.matsoft.apifinancas.adapters.controllers.mapper.DespesasMapper;
import br.com.matsoft.apifinancas.adapters.controllers.mapper.OrcamentosMapper;
import br.com.matsoft.apifinancas.adapters.controllers.mapper.ReceitasMapper;
import br.com.matsoft.apifinancas.application.usecases.CreateDespesasUseCaseImpl;
import br.com.matsoft.apifinancas.application.usecases.CreateOrcamentosUseCaseImpl;
import br.com.matsoft.apifinancas.application.usecases.CreateReceitasUseCaseImpl;
import br.com.matsoft.apifinancas.core.domain.dtos.DespesasDTO;
import br.com.matsoft.apifinancas.core.domain.dtos.OrcamentosDTO;
import br.com.matsoft.apifinancas.core.domain.dtos.ReceitasDTO;
import br.com.matsoft.apifinancas.core.exception.FinancasAlreadyExists;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class FinancasController {

    private final CreateDespesasUseCaseImpl createDespesasUseCase;
    private final CreateReceitasUseCaseImpl createReceitasUseCase;
    private final CreateOrcamentosUseCaseImpl createOrcamentosUseCase;
    private final DespesasMapper despesasMapper;
    private final OrcamentosMapper orcamentosMapper;
    private final ReceitasMapper receitasMapper;

    public FinancasController(CreateDespesasUseCaseImpl createDespesasUseCase,
                              CreateReceitasUseCaseImpl createReceitasUseCase,
                              CreateOrcamentosUseCaseImpl createOrcamentosUseCase,
                              DespesasMapper despesasMapper, OrcamentosMapper orcamentosMapper,
                              ReceitasMapper receitasMapper) {
        this.createDespesasUseCase = createDespesasUseCase;
        this.createReceitasUseCase = createReceitasUseCase;
        this.createOrcamentosUseCase = createOrcamentosUseCase;
        this.despesasMapper = despesasMapper;
        this.orcamentosMapper = orcamentosMapper;
        this.receitasMapper = receitasMapper;
    }


    @PostMapping("/create-despesa")
    CreateDespesasResponse createDespesa(@RequestBody CreateDespesasRequest request) throws FinancasAlreadyExists {
        DespesasDTO despesasBusinessObj = despesasMapper.toDespesas(request);
        DespesasDTO despesasDTO = createDespesasUseCase.createDespesas(despesasBusinessObj);
        return despesasMapper.toResponse(despesasDTO);
    }

    @PostMapping("/create-receitas")
    CreateReceitasResponse createReceitas(@RequestBody CreateReceitasRequest request) throws FinancasAlreadyExists {
        ReceitasDTO receitasBusinessObj = receitasMapper.toReceitas(request);
        ReceitasDTO receitasDTO = createReceitasUseCase.createReceitas(receitasBusinessObj);
        return receitasMapper.toResponse(receitasDTO);
    }

    @PostMapping("/create-orcamentos")
    CreateOrcamentoResponse createOrcamentos(@RequestBody CreateOrcamentoRequest request) throws FinancasAlreadyExists {
        OrcamentosDTO orcamentosBusinessObj = orcamentosMapper.toOrcamentos(request);
        OrcamentosDTO orcamentosDTO = createOrcamentosUseCase.createOrcamento(orcamentosBusinessObj);
        return orcamentosMapper.toResponse(orcamentosDTO);
    }
}