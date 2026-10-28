package org.example.chainofresponsability;

public class CEO extends Aprovador {

    public CEO(Aprovador aprovadorSuperior) {
        listaTiposDespesa.add(TipoDespesaExcepcional.getTipoDespesaExcepcional());
        setAprovadorSuperior(aprovadorSuperior);
    }

    public String getCargo() {
        return "CEO";
    }

}
