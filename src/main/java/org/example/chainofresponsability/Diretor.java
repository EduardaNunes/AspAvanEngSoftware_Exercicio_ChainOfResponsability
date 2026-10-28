package org.example.chainofresponsability;

public class Diretor extends Aprovador {

    public Diretor(Aprovador aprovadorSuperior) {
        listaTiposDespesa.add(TipoDespesaGrande.getTipoDespesaGrande());
        setAprovadorSuperior(aprovadorSuperior);
    }

    public String getCargo() {
        return "Diretor";
    }
}
