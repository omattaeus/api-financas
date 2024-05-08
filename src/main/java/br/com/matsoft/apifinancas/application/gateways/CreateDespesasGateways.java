package br.com.matsoft.apifinancas.application.gateways;

import br.com.matsoft.apifinancas.adapters.persistence.DespesasEntity;
import br.com.matsoft.apifinancas.core.domain.dtos.DespesasDTO;
import br.com.matsoft.apifinancas.core.exception.FinancasAlreadyExists;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public interface CreateDespesasGateways {

    public DespesasDTO createDespesas(DespesasDTO despesas) throws FinancasAlreadyExists;
    public DespesasEntity getByIdDespesas(Long id);

}