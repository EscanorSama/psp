package ejercicio6;

import java.util.Random;

public class Consumidor extends Thread{

    Cola cola;
    public Consumidor(Cola cola){
        this.cola=cola;
    }
    @Override
    public void run() {
        super.run();
        Random r = new Random();
        int retiro = r.nextInt(4) + 1;
        cola.quitar(retiro);

    }
}
