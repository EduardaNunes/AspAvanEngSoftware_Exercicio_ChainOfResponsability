package org.example.chainofresponsability;

public class TipoDespesaPessoal implements TipoDespesa {

    private static TipoDespesaPessoal tipoDespesaPessoal = new TipoDespesaPessoal();

    private TipoDespesaPessoal() {};

    public static TipoDespesaPessoal getTipoDespesaPessoal() {
        return tipoDespesaPessoal;
    }
}
