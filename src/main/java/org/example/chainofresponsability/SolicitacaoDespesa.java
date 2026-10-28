package org.example.chainofresponsability;

public class SolicitacaoDespesa {

    private float valor;
    private String descricao;

    public SolicitacaoDespesa(float valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }
}
