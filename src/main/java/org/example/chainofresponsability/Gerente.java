package org.example.chainofresponsability;

public class Gerente extends Aprovador {

    public Gerente(Aprovador aprovadorSuperior) {
        super(5000.0f);
        setAprovadorSuperior(aprovadorSuperior);
    }

    public String getCargo() {
        return "Gerente";
    }
}
