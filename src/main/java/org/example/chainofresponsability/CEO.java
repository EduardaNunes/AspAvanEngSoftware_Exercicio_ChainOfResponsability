package org.example.chainofresponsability;

public class CEO extends Aprovador {

    public CEO() {
        super(Float.MAX_VALUE);
    }

    public String getCargo() {
        return "CEO";
    }
}
