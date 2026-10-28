package org.example.chainofresponsability;

public class Supervisor extends Aprovador {

    public Supervisor(Aprovador aprovadorSuperior) {
        listaTiposDespesa.add(TipoDespesaPequena.getTipoDespesaPequena());
        setAprovadorSuperior(aprovadorSuperior);
    }

    public String getCargo() {
        return "Supervisor";
    }

}
