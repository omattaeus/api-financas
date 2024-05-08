package br.com.matsoft.apifinancas.adapters.configuration;

import br.com.matsoft.apifinancas.adapters.controllers.mapper.DespesasMapper;
import br.com.matsoft.apifinancas.adapters.controllers.mapper.OrcamentosMapper;
import br.com.matsoft.apifinancas.adapters.controllers.mapper.ReceitasMapper;
import br.com.matsoft.apifinancas.adapters.gateways.*;
import br.com.matsoft.apifinancas.adapters.persistence.DespesasRepository;
import br.com.matsoft.apifinancas.adapters.persistence.OrcamentosRepository;
import br.com.matsoft.apifinancas.adapters.persistence.ReceitasRepository;
import br.com.matsoft.apifinancas.application.gateways.CreateDespesasGateways;
import br.com.matsoft.apifinancas.application.gateways.CreateOrcamentosGateway;
import br.com.matsoft.apifinancas.application.gateways.CreateReceitasGateways;
import br.com.matsoft.apifinancas.application.usecases.*;
import br.com.matsoft.apifinancas.core.ports.FinancasRepositoryService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration(enforceUniqueMethods = false)
@EnableTransactionManagement
@EnableJpaAuditing
public class FinancasConfig {

    @Bean
    @Primary
    CreateDespesasUseCaseImpl createDespesasUseCase(CreateDespesasGateways createDespesasGateways,
                                                    FinancasRepositoryService financasRepositoryService){
        return new CreateDespesasUseCaseImpl(createDespesasGateways, financasRepositoryService);
    }

    @Bean
    @Primary
    CreateOrcamentosUseCaseImpl createOrcamentosUseCase(CreateOrcamentosGateway createOrcamentosGateway,
                                                        FinancasRepositoryService financasRepositoryService){
        return new CreateOrcamentosUseCaseImpl(createOrcamentosGateway, financasRepositoryService);
    }

    @Bean
    @Primary
    CreateReceitasUseCaseImpl createReceitasUseCase(CreateReceitasGateways createReceitasGateways,
                                                    FinancasRepositoryService financasRepositoryService){
        return new CreateReceitasUseCaseImpl(createReceitasGateways, financasRepositoryService);
    }

    @Bean
    @Primary
    CreateDespesasRepositoryGateway createDespesasRepositoryGateway(DespesasRepository despesasRepository,
                                                                    DespesasEntityMapper despesasEntityMapper){
        return new CreateDespesasRepositoryGateway(despesasRepository, despesasEntityMapper);
    }

    @Bean
    @Primary
    CreateOrcamentosRepositoryGateway createOrcamentosRepositoryGateway(OrcamentosRepository orcamentosRepository,
                                                                        OrcamentosEntityMapper orcamentosEntityMapper){
        return new CreateOrcamentosRepositoryGateway(orcamentosRepository, orcamentosEntityMapper);
    }

    @Bean
    @Primary
    CreateReceitasRepositoryGateway createOrcamentosRepositoryGateway(ReceitasRepository receitasRepository,
                                                                      ReceitasEntityMapper receitasEntityMapper){
        return new CreateReceitasRepositoryGateway(receitasRepository, receitasEntityMapper);
    }

    @Bean
    DespesasEntityMapper despesasEntityMapper(){
        return new DespesasEntityMapper();
    }

    @Bean
    OrcamentosEntityMapper orcamentosEntityMapper(){
        return new OrcamentosEntityMapper();
    }

    @Bean
    ReceitasEntityMapper receitasEntityMapper(){
        return new ReceitasEntityMapper();
    }

    @Bean
    DespesasMapper despesasMapper(){
        return new DespesasMapper();
    }

    @Bean
    OrcamentosMapper orcamentosMapper(){
        return new OrcamentosMapper();
    }

    @Bean
    ReceitasMapper receitasMapper(){
        return new ReceitasMapper();
    }
}