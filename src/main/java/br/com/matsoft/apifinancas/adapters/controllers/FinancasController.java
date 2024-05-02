package br.com.matsoft.apifinancas.adapters.controllers;

import br.com.matsoft.apifinancas.application.usecases.CreateFinancasUseCaseImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("despesas")
public class FinancasController {

    private final CreateFinancasUseCaseImpl createFinancasUseCase;

    public FinancasController(CreateFinancasUseCaseImpl createFinancasUseCase) {
        this.createFinancasUseCase = createFinancasUseCase;
    }

    @GetMapping
    
}
