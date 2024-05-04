package br.com.matsoft.apifinancas.adapters.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrcamentosRepository extends JpaRepository<OrcamentosEntity, Long> {}
