package br.edu.ucsal.pooAdv.sergiolj.listaCarnaval.models;

public class MyCounter {
    private int counter = 0;

    public synchronized void increment() {
        counter++;
    }
    public synchronized int getCounter() {
        return counter;
    }
}
