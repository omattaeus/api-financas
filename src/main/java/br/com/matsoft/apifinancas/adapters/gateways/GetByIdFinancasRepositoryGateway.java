package br.com.matsoft.apifinancas.adapters.gateways;

import br.com.matsoft.apifinancas.adapters.persistence.*;
import br.com.matsoft.apifinancas.application.gateways.GetByIdFinancasGateways;

public class GetByIdFinancasRepositoryGateway implements GetByIdFinancasGateways {

    private final DespesasRepository despesasRepository;
    private final OrcamentosRepository orcamentosRepository;
    private final ReceitasRepository receitasRepository;

    public GetByIdFinancasRepositoryGateway(DespesasRepository despesasRepository, OrcamentosRepository orcamentosRepository, ReceitasRepository receitasRepository) {
        this.despesasRepository = despesasRepository;
        this.orcamentosRepository = orcamentosRepository;
        this.receitasRepository = receitasRepository;
    }

    @Override
    public OrcamentosEntity getByIdOrcamentos(Long id) {
        return orcamentosRepository.getReferenceById(id);
    }

    @Override
    public ReceitasEntity getByIdReceitas(Long id) {
        return receitasRepository.getReferenceById(id);
    }

    @Override
    public DespesasEntity getByIdDespesas(Long id) {
        return despesasRepository.getReferenceById(id);
    }
}
