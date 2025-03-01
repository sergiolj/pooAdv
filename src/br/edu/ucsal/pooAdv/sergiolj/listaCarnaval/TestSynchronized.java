package br.edu.ucsal.pooAdv.sergiolj.listaCarnaval;

import br.edu.ucsal.pooAdv.sergiolj.listaCarnaval.models.IncrementFactory;
import br.edu.ucsal.pooAdv.sergiolj.listaCarnaval.models.MyCounter;

public class TestSynchronized {
    public static void main(String[] args) {
        var sharedCounter = new MyCounter();
        int numThreads = 4;
        int numIterations = 1000;

        Thread[] threads = new Thread[numThreads];
        for (int i = 0; i < numThreads; i++) {
            threads[i] = new Thread(new IncrementFactory(sharedCounter,numIterations));
            threads[i].start();
        }

        for (int i = 0; i < numThreads; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                System.out.println("Thread interrompida durante o join.");
            }
        }

        int predicted = numThreads * numIterations;
        int obtained = sharedCounter.getCounter();
        System.out.printf("Valor Obtido: %d x Valor Esperado: %d\n", obtained, predicted);
    }
}
