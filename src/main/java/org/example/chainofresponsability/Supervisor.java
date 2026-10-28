package org.example.chainofresponsability;

public class Supervisor extends Aprovador {

    public Supervisor(Aprovador aprovadorSuperior) {
        super(500.0f);
        setAprovadorSuperior(aprovadorSuperior);
    }

    public String getCargo() {
        return "Supervisor";
    }
}
