package org.example.chainofresponsability;

public class Gerente extends Aprovador {

    public Gerente(Aprovador aprovadorSuperior) {
        listaTiposDespesa.add(TipoDespesaMedia.getTipoDespesaMedia());
        setAprovadorSuperior(aprovadorSuperior);
    }

    public String getCargo() {
        return "Gerente";
    }

}
