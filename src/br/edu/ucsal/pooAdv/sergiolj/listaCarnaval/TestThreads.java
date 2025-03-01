package br.edu.ucsal.pooAdv.sergiolj.listaCarnaval;

import br.edu.ucsal.pooAdv.sergiolj.listaCarnaval.models.NumberCounterHeritage;
import br.edu.ucsal.pooAdv.sergiolj.listaCarnaval.models.NumberCounterInterface;

public class TestThreads {
    public static void main(String[] args) {

        /*
         * Quando usamos interface para uma Thread estamos apenas assinando
         * um contrato para implementar run(), a classe criada não tem os demais
         * métodos de uma thread como o start, por isso temos que criar uma instância da
         * classe Thread passando nossas classes como parâmetro para poder iniciar uma Thread.
         */


        var nc1 = new NumberCounterHeritage("Number One");
        var nc2 = new NumberCounterHeritage("Number Two");

        nc1.start();
        nc2.start();

        var nc3 = new NumberCounterInterface("Number Three");
        var nc4 = new NumberCounterInterface("Number Four");

        Thread t1 = new Thread(nc3);
        Thread t2 = new Thread(nc4);
        t1.start();
        t2.start();
        System.out.println("Threads iniciadas");
    }
}
