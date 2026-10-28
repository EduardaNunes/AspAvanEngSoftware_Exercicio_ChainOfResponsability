package org.example.chainofresponsability;

public class TipoDespesaGrande implements TipoDespesa {

    private static TipoDespesaGrande tipoDespesaGrande = new TipoDespesaGrande();

    private TipoDespesaGrande() {};

    public static TipoDespesaGrande getTipoDespesaGrande() {
        return tipoDespesaGrande;
    }
}
