package br.edu.ucsal.pooAdv.sergiolj.listaCarnaval.myInterface;

public interface Runner{
    String getName();

    default void run(){
        System.out.println(getName() + " is running");
    }
}
