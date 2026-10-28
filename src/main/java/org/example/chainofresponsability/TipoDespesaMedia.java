package org.example.chainofresponsability;

public class TipoDespesaMedia implements TipoDespesa {

    private static TipoDespesaMedia tipoDespesaMedia = new TipoDespesaMedia();

    private TipoDespesaMedia() {};

    public static TipoDespesaMedia getTipoDespesaMedia() {
        return tipoDespesaMedia;
    }
}
