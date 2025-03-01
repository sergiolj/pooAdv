package br.edu.ucsal.pooAdv.sergiolj.listaCarnaval.models;

import br.edu.ucsal.pooAdv.sergiolj.listaCarnaval.myInterface.MyRunnable;

public class NumberCounterHeritage extends Thread implements MyRunnable{
    private final String name;

    public NumberCounterHeritage(String name) {
        this.name = name;
    }

    @Override
        public void run() {
        for (int i = 0; i <= NUMBER; i++) {
                System.out.println("Thread " + name + " is executing... "+ i);
            try {
                Thread.sleep(DELAY);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
