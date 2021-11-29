package ejercicio62;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer>listComun=new LinkedList<Integer>();
        Cola cola=new Cola(listComun);
        final int NUM_CONSUMIDORES=24;
        final int NUM_PRODUCTORES=4;
        Thread[] productores=new Thread[NUM_PRODUCTORES];
        Thread[] consumidores=new Thread[NUM_CONSUMIDORES];

        for (int i = 0; i < NUM_PRODUCTORES; i++) {
            productores[i]=new Thread(new Productor(cola));
            productores[i].setName(""+(i+1));
            productores[i].start();

        }
        for (int i = 0; i < NUM_CONSUMIDORES; i++) {
            consumidores[i]=new Thread(new Consumidor(cola));
            consumidores[i].setName(""+(i+1));
            consumidores[i].start();

        }
    }
}
