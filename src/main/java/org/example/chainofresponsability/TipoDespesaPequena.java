package org.example.chainofresponsability;

public class TipoDespesaPequena implements TipoDespesa {

    private static TipoDespesaPequena tipoDespesaPequena = new TipoDespesaPequena();

    private TipoDespesaPequena() {};

    public static TipoDespesaPequena getTipoDespesaPequena() {
        return tipoDespesaPequena;
    }
}
