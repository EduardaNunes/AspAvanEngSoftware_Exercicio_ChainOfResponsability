package org.example.chainofresponsability;

import java.util.ArrayList;

public abstract class Aprovador {

    protected ArrayList listaTiposDespesa = new ArrayList();
    private Aprovador aprovadorSuperior;

    public Aprovador getAprovadorSuperior() {
        return aprovadorSuperior;
    }

    public void setAprovadorSuperior(Aprovador aprovadorSuperior) {
        this.aprovadorSuperior = aprovadorSuperior;
    }

    public abstract String getCargo();

    public String aprovarDespesa(SolicitacaoDespesa solicitacao) {
        if (listaTiposDespesa.contains(solicitacao.getTipoDespesa())) {
            return getCargo();
        }
        else {
            if (aprovadorSuperior != null) {
                return aprovadorSuperior.aprovarDespesa(solicitacao);
            }
            else
            {
                return "Sem aprovação";
            }
        }
    }
}
