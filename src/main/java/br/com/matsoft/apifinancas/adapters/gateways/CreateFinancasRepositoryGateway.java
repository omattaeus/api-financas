package br.com.matsoft.apifinancas.adapters.gateways;

import br.com.matsoft.apifinancas.adapters.persistence.*;
import br.com.matsoft.apifinancas.core.domain.dtos.DespesasDTO;
import br.com.matsoft.apifinancas.core.domain.dtos.OrcamentosDTO;
import br.com.matsoft.apifinancas.core.domain.dtos.ReceitasDTO;
import br.com.matsoft.apifinancas.application.gateways.CreateFinancasGateways;
import br.com.matsoft.apifinancas.core.exception.FinancasAlreadyExists;

public class CreateFinancasRepositoryGateway implements CreateFinancasGateways {

    private final DespesasRepository despesasRepository;
    private final OrcamentosRepository orcamentosRepository;
    private final ReceitasRepository receitasRepository;
    private final DespesasEntityMapper despesasEntityMapper;
    private final OrcamentosEntityMapper orcamentosEntityMapper;
    private final ReceitasEntityMapper receitasEntityMapper;

    public CreateFinancasRepositoryGateway(DespesasRepository despesasRepository, OrcamentosRepository orcamentosRepository, ReceitasRepository receitasRepository, DespesasEntityMapper despesasEntityMapper, OrcamentosEntityMapper orcamentosEntityMapper, ReceitasEntityMapper receitasEntityMapper) {
        this.despesasRepository = despesasRepository;
        this.orcamentosRepository = orcamentosRepository;
        this.receitasRepository = receitasRepository;
        this.despesasEntityMapper = despesasEntityMapper;
        this.orcamentosEntityMapper = orcamentosEntityMapper;
        this.receitasEntityMapper = receitasEntityMapper;
    }

    @Override
    public ReceitasDTO createReceitas(ReceitasDTO receitasDomainObj) throws FinancasAlreadyExists {
        ReceitasEntity receitasEntity = receitasEntityMapper.toEntity(receitasDomainObj);
        ReceitasEntity savedObj = receitasRepository.save(receitasEntity);
        return receitasEntityMapper.toDomainObj(savedObj);
    }

    @Override
    public OrcamentosDTO createOrcamento(OrcamentosDTO orcamentosDomainObj) throws FinancasAlreadyExists {
        OrcamentosEntity orcamentosEntity = orcamentosEntityMapper.toEntity(orcamentosDomainObj);
        OrcamentosEntity savedObj = orcamentosRepository.save(orcamentosEntity);
        return orcamentosEntityMapper.toDomainObj(savedObj);
    }

    @Override
    public DespesasDTO createDespesas(DespesasDTO despesasDomainObj) throws FinancasAlreadyExists {
        DespesasEntity despesasEntity = despesasEntityMapper.toEntity(despesasDomainObj);
        DespesasEntity savedObj = despesasRepository.save(despesasEntity);
        return despesasEntityMapper.toDomainObj(savedObj);
    }
}