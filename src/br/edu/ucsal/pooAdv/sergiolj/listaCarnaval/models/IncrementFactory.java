package br.edu.ucsal.pooAdv.sergiolj.listaCarnaval.models;

import org.w3c.dom.css.Counter;

public class IncrementFactory implements Runnable {
    private final MyCounter counter;
    private final int times;

    public IncrementFactory(MyCounter counter, int times) {
        this.counter = counter;
        this.times = times;
    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            counter.increment();
        }
    }
}
