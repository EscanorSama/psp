package ejercicio62;

import java.util.Random;

public class Productor implements Runnable{

    Cola cola;
    public Productor(Cola cola){
        this.cola=cola;
    }
    @Override
    public void run() {
        Random r=new Random();
        int random=r.nextInt(90-(-50)+1)-50;
        cola.put(random);
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
