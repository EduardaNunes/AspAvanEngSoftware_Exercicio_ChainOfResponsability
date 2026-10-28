package org.example.chainofresponsability;

public abstract class Aprovador {

    protected float limiteAprovacao;
    private Aprovador aprovadorSuperior;

    public Aprovador(float limiteAprovacao) {
        this.limiteAprovacao = limiteAprovacao;
    }

    public Aprovador getAprovadorSuperior() {
        return aprovadorSuperior;
    }

    public void setAprovadorSuperior(Aprovador aprovadorSuperior) {
        this.aprovadorSuperior = aprovadorSuperior;
    }

    public abstract String getCargo();

    public String aprovarDespesa(SolicitacaoDespesa solicitacao) {
        if (solicitacao.getValor() <= this.limiteAprovacao) {
            return getCargo();
        }
        else {
            if (aprovadorSuperior != null) {
                return aprovadorSuperior.aprovarDespesa(solicitacao);
            }
            else {
                return "Sem aprovação";
            }
        }
    }
}
