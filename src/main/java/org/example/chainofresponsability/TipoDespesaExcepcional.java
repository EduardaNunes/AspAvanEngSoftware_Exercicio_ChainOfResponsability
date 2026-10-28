package org.example.chainofresponsability;

public class TipoDespesaExcepcional implements TipoDespesa {

    private static TipoDespesaExcepcional tipoDespesaExcepcional = new TipoDespesaExcepcional();

    private TipoDespesaExcepcional() {};

    public static TipoDespesaExcepcional getTipoDespesaExcepcional() {
        return tipoDespesaExcepcional;
    }
}
