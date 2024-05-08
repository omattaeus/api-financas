package br.com.matsoft.apifinancas.application.usecases;

import br.com.matsoft.apifinancas.adapters.persistence.OrcamentosEntity;
import br.com.matsoft.apifinancas.application.gateways.CreateOrcamentosGateway;
import br.com.matsoft.apifinancas.core.domain.dtos.OrcamentosDTO;
import br.com.matsoft.apifinancas.core.exception.FinancasAlreadyExists;
import br.com.matsoft.apifinancas.core.ports.FinancasRepositoryService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CreateOrcamentosUseCaseImpl implements CreateOrcamentosGateway {

    @Qualifier("createOrcamentosGateway")
    private final CreateOrcamentosGateway createOrcamentosGateway;
    @Qualifier("financasRepositoryService")
    private final FinancasRepositoryService financasRepositoryService;

    public CreateOrcamentosUseCaseImpl(CreateOrcamentosGateway createOrcamentosGateway, FinancasRepositoryService financasRepositoryService) {
        this.createOrcamentosGateway = createOrcamentosGateway;
        this.financasRepositoryService = financasRepositoryService;
    }

    @Override
    public OrcamentosDTO createOrcamento(OrcamentosDTO orcamentos) throws FinancasAlreadyExists {
        if(financasRepositoryService.doesFinancasNameExists(orcamentos.nome()))
            throw new FinancasAlreadyExists();

        return createOrcamentosGateway.createOrcamento(orcamentos);
    }

    @Override
    public OrcamentosEntity getByIdOrcamentos(Long id) {
        return createOrcamentosGateway.getByIdOrcamentos(id);
    }
}