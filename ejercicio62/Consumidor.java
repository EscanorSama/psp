package ejercicio62;

import java.util.Random;

public class Consumidor implements Runnable{


    Cola cola;
    public Consumidor(Cola cola){
        this.cola=cola;
    }
    @Override
    public void run() {
        cola.get();
        while (true){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
