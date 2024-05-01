package br.com.matsoft.apifinancas.adapters.persistence;

import br.com.matsoft.apifinancas.application.dtos.DespesasDTO;
import br.com.matsoft.apifinancas.application.dtos.OrcamentosDTO;
import br.com.matsoft.apifinancas.application.dtos.ReceitasDTO;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class FinancasRepositoryImpl implements FinancasRepository{

    @Autowired
    private final EntityManager entityManager;

    public FinancasRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public DespesasDTO saveDespesas(DespesasDTO despesas) {
        entityManager.persist(despesas);
        return despesas;
    }

    @Override
    public OrcamentosDTO saveOrcamentos(OrcamentosDTO orcamentos) {
        entityManager.persist(orcamentos);
        return orcamentos;
    }

    @Override
    public ReceitasDTO saveReceitas(ReceitasDTO receitas) {
        entityManager.persist(receitas);
        return receitas;
    }
}