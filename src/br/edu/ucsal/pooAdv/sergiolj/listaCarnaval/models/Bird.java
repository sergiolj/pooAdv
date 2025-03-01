package br.edu.ucsal.pooAdv.sergiolj.listaCarnaval.models;

import br.edu.ucsal.pooAdv.sergiolj.listaCarnaval.myInterface.Flyer;

public class Bird implements Flyer {
    private String name;

    public Bird(String name) {
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.println("A " + name + " movimenta suas asas e voa!\n");
    }
}
