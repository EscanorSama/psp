package ejercicio6;

import java.util.ArrayList;
import java.util.Random;


public class Productor extends Thread{

    Cola cola;
    public Productor(Cola cola){
        this.cola=cola;
    }
    int vProduccion;
    @Override
    public void run() {
        super.run();
        Random r = new Random();
        vProduccion=r.nextInt(5)+1;
            for (int i = 1; i <=vProduccion ; i++) {

                        cola.almacenar(i);




            }

        }

}
