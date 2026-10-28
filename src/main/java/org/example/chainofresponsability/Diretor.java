package org.example.chainofresponsability;

public class Diretor extends Aprovador {

    public Diretor(Aprovador aprovadorSuperior) {
        super(50000.0f);
        setAprovadorSuperior(aprovadorSuperior);
    }

    public String getCargo() {
        return "Diretor";
    }
}
