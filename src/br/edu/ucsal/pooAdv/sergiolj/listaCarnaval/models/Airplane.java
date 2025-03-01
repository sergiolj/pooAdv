package br.edu.ucsal.pooAdv.sergiolj.listaCarnaval.models;

import br.edu.ucsal.pooAdv.sergiolj.listaCarnaval.myInterface.Flyer;

public class Airplane implements Flyer {
    private String model;

    public Airplane(String model) {
        this.model = model;
    }

    @Override
    public void fly() {
        System.out.printf("O " + model + " liga seus motores e corre a pista para decolar!\n");

    }
}
