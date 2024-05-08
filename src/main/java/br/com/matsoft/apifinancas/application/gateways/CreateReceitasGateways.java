package br.com.matsoft.apifinancas.application.gateways;

import br.com.matsoft.apifinancas.adapters.persistence.ReceitasEntity;
import br.com.matsoft.apifinancas.core.domain.dtos.ReceitasDTO;
import br.com.matsoft.apifinancas.core.exception.FinancasAlreadyExists;

public interface CreateReceitasGateways {

    public ReceitasDTO createReceitas(ReceitasDTO receitas) throws FinancasAlreadyExists;
    public ReceitasEntity getByIdReceitas(Long id);

}
