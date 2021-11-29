package ejercicio9;

import java.util.Random;

public class Trabajador extends Thread{
    Random r=new Random();
    Concurso concurso;
    public Trabajador(Concurso concurso){
        this.concurso=concurso;
    }

    @Override
    public void run() {
        super.run();
        while (true){
        concurso.setNumber(r.nextInt(30)+1);
    }}
}
