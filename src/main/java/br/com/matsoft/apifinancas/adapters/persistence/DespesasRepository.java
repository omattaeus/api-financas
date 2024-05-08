package br.com.matsoft.apifinancas.adapters.persistence;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
@ComponentScan
public interface DespesasRepository extends JpaRepository<DespesasEntity, Long> {}
