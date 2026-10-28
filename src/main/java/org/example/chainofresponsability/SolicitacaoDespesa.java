package org.example.chainofresponsability;

public class SolicitacaoDespesa {

    private TipoDespesa tipoDespesa;

    public SolicitacaoDespesa(TipoDespesa tipoDespesa) {
        this.tipoDespesa = tipoDespesa;
    }

    public TipoDespesa getTipoDespesa() {
        return tipoDespesa;
    }

    public void setTipoDespesa(TipoDespesa tipoDespesa) {
        this.tipoDespesa = tipoDespesa;
    }

}
