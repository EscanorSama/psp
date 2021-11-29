package ejercicio9;

import java.util.Random;

public class Jugador extends Thread {
    Random r=new Random();
    Concurso concurso;
    int id;
    public Jugador(Concurso concurso,int id){
        this.concurso=concurso;
        this.id=id;
    }

    @Override
    public void run() {
        super.run();
        while (true){

        try {
            sleep(1000*(r.nextInt(2)+1));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        concurso.getNumber(r.nextInt(30)+1,id);
    }}
}
