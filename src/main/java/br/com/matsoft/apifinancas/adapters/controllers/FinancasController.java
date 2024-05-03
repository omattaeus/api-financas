package br.com.matsoft.apifinancas.adapters.controllers;

import br.com.matsoft.apifinancas.adapters.controllers.mapper.DespesasMapper;
import br.com.matsoft.apifinancas.adapters.controllers.mapper.OrcamentosMapper;
import br.com.matsoft.apifinancas.adapters.controllers.mapper.ReceitasMapper;
import br.com.matsoft.apifinancas.core.domain.dtos.DespesasDTO;
import br.com.matsoft.apifinancas.core.domain.dtos.OrcamentosDTO;
import br.com.matsoft.apifinancas.core.domain.dtos.ReceitasDTO;
import br.com.matsoft.apifinancas.core.exception.FinancasAlreadyExists;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class FinancasController {

    private final CreateFinancasUseCaseImpl createFinancasUseCase;
    private final DespesasMapper despesasMapper;
    private final OrcamentosMapper orcamentosMapper;
    private final ReceitasMapper receitasMapper;

    public FinancasController(CreateFinancasUseCaseImpl createFinancasUseCase, DespesasMapper despesasMapper, OrcamentosMapper orcamentosMapper, ReceitasMapper receitasMapper) {
        this.createFinancasUseCase = createFinancasUseCase;
        this.despesasMapper = despesasMapper;
        this.orcamentosMapper = orcamentosMapper;
        this.receitasMapper = receitasMapper;
    }

    @PostMapping("/create-despesa")
    CreateDespesasResponse createDespesa(@RequestBody CreateDespesasRequest request) throws FinancasAlreadyExists {
        DespesasDTO despesasBusinessObj = despesasMapper.toDespesas(request);
        DespesasDTO despesasDTO = createFinancasUseCase.createDespesas(despesasBusinessObj);
        return despesasMapper.toResponse(despesasDTO);
    }

    @PostMapping("/create-receitas")
    CreateReceitasResponse createReceitas(@RequestBody CreateReceitasRequest request) throws FinancasAlreadyExists {
        ReceitasDTO receitasBusinessObj = receitasMapper.toReceitas(request);
        ReceitasDTO receitasDTO = createFinancasUseCase.createReceitas(receitasBusinessObj);
        return receitasMapper.toResponse(receitasDTO);
    }

    @PostMapping("/create-orcamentos")
    CreateOrcamentoResponse createOrcamentos(@RequestBody CreateOrcamentoRequest request) throws FinancasAlreadyExists {
        OrcamentosDTO orcamentosBusinessObj = orcamentosMapper.toOrcamentos(request);
        OrcamentosDTO orcamentosDTO = createFinancasUseCase.createOrcamento(orcamentosBusinessObj);
        return orcamentosMapper.toResponse(orcamentosDTO);
    }
}