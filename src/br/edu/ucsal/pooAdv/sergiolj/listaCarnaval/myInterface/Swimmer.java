package br.edu.ucsal.pooAdv.sergiolj.listaCarnaval.myInterface;

import br.edu.ucsal.pooAdv.sergiolj.listaCarnaval.models.Athlete;

public interface Swimmer {
    String getName();

    default void swim(){
        System.out.println(getName() + " is swimming");
    }
}
