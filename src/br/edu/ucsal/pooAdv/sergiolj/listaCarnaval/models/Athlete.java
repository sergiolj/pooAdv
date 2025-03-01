package br.edu.ucsal.pooAdv.sergiolj.listaCarnaval.models;

public abstract class Athlete {
    String name = null;

    public Athlete(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
