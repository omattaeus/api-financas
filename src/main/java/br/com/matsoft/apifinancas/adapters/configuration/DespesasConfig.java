package br.com.matsoft.apifinancas.adapters.configuration;

import br.com.matsoft.apifinancas.adapters.controllers.mapper.DespesasMapper;
import br.com.matsoft.apifinancas.adapters.controllers.mapper.OrcamentosMapper;
import br.com.matsoft.apifinancas.adapters.controllers.mapper.ReceitasMapper;
import br.com.matsoft.apifinancas.adapters.gateways.DespesasEntityMapper;
import br.com.matsoft.apifinancas.adapters.gateways.OrcamentosEntityMapper;
import br.com.matsoft.apifinancas.adapters.gateways.ReceitasEntityMapper;
import br.com.matsoft.apifinancas.application.usecases.*;
import br.com.matsoft.apifinancas.core.ports.DespesasRepositoryService;
import br.com.matsoft.apifinancas.core.ports.FinancasRepositoryService;
import br.com.matsoft.apifinancas.core.ports.OrcamentosRepositoryService;
import br.com.matsoft.apifinancas.core.ports.ReceitasRepositoryService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DespesasConfig {

    @Bean
    CreateDespesasUseCaseImpl createDespesasUseCase(DespesasRepositoryService despesasRepositoryService,
                                                    FinancasRepositoryService financasRepositoryService){
        return new CreateDespesasUseCaseImpl(despesasRepositoryService, financasRepositoryService);
    }

    @Bean
    CreateOrcamentosUseCaseImpl createOrcamentosUseCase(OrcamentosRepositoryService orcamentosRepositoryService,
                                                        FinancasRepositoryService financasRepositoryService){
        return new CreateOrcamentosUseCaseImpl(orcamentosRepositoryService, financasRepositoryService);
    }

    @Bean
    CreateReceitasUseCaseImpl createReceitasUseCase(ReceitasRepositoryService receitasRepositoryService,
                                                    FinancasRepositoryService financasRepositoryService){
        return new CreateReceitasUseCaseImpl(receitasRepositoryService, financasRepositoryService);
    }

    @Bean
    GetByIdDespesasUseCaseImpl getByIdDespesasUseCase(DespesasRepositoryService despesasRepositoryService){
        return new GetByIdDespesasUseCaseImpl(despesasRepositoryService);
    }

    @Bean
    GetByIdOrcamentosUseCaseImpl getByIdOrcamentosUseCase(OrcamentosRepositoryService orcamentosRepositoryService){
        return new GetByIdOrcamentosUseCaseImpl(orcamentosRepositoryService);
    }

    @Bean
    GetByIdReceitasUseCaseImpl getByIdReceitasUseCase(ReceitasRepositoryService receitasRepositoryService){
        return new GetByIdReceitasUseCaseImpl(receitasRepositoryService);
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