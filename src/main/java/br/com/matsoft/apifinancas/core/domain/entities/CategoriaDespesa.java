package br.com.matsoft.apifinancas.core.domain.entities;

public class CategoriaDespesa {

    private String fixas;
    private String variavel;

    public CategoriaDespesa(){}

    public CategoriaDespesa(String fixas, String variavel) {
        this.fixas = fixas;
        this.variavel = variavel;
    }

    public String getFixas() {
        return fixas;
    }

    public void setFixas(String fixas) {
        this.fixas = fixas;
    }

    public String getVariavel() {
        return variavel;
    }

    public void setVariavel(String variavel) {
        this.variavel = variavel;
    }
}