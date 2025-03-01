package br.edu.ucsal.pooAdv.sergiolj.listaCarnaval.models;

import br.edu.ucsal.pooAdv.sergiolj.listaCarnaval.myInterface.Runner;
import br.edu.ucsal.pooAdv.sergiolj.listaCarnaval.myInterface.Swimmer;

public class Triathlete extends Athlete implements Runner, Swimmer{

    public Triathlete(String name) {
        super(name);
    }
}
