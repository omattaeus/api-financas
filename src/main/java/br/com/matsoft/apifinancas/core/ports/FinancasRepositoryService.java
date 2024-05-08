package br.com.matsoft.apifinancas.core.ports;


import org.springframework.stereotype.Component;

@Component
public interface FinancasRepositoryService {

    public Boolean doesFinancasNameExists(String name);
}