package br.com.matsoft.apifinancas.application.usecases;

import br.com.matsoft.apifinancas.application.gateways.CreateOrcamentosGateway;
import br.com.matsoft.apifinancas.core.domain.dtos.DespesasDTO;
import br.com.matsoft.apifinancas.core.domain.dtos.OrcamentosDTO;
import br.com.matsoft.apifinancas.core.exception.FinancasAlreadyExists;
import br.com.matsoft.apifinancas.core.ports.FinancasRepositoryService;
import br.com.matsoft.apifinancas.core.ports.OrcamentosRepositoryService;

public class CreateOrcamentosUseCaseImpl implements CreateOrcamentosGateway {

    private final OrcamentosRepositoryService orcamentosRepositoryService;
    private final FinancasRepositoryService financasRepositoryService;

    public CreateOrcamentosUseCaseImpl(OrcamentosRepositoryService orcamentosRepositoryService, FinancasRepositoryService financasRepositoryService) {
        this.orcamentosRepositoryService = orcamentosRepositoryService;
        this.financasRepositoryService = financasRepositoryService;
    }

    @Override
    public OrcamentosDTO createOrcamento(OrcamentosDTO orcamentos) throws FinancasAlreadyExists {
        if(financasRepositoryService.doesFinancasNameExists(orcamentos.nome()))
            throw new FinancasAlreadyExists();

        return orcamentosRepositoryService.saveOrcamentos(orcamentos);
    }
}