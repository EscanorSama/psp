package ejercicio9;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        Concurso concurso=new Concurso(list);
        Trabajador trabajador1=new Trabajador(concurso);
        Trabajador trabajador2=new Trabajador(concurso);
        Jugador jugadores1=new Jugador(concurso,1);
        Jugador jugadores2=new Jugador(concurso,2);
        Jugador jugadores3=new Jugador(concurso,3);
        Jugador jugadores4=new Jugador(concurso,4);
        Jugador jugadores5=new Jugador(concurso,5);
        Jugador jugadores6=new Jugador(concurso,6);
        Jugador jugadores7=new Jugador(concurso,7);
        Jugador jugadores8=new Jugador(concurso,8);
        Jugador jugadores9=new Jugador(concurso,9);
        Jugador jugadores10=new Jugador(concurso,10);
        Jugador jugadores11=new Jugador(concurso,11);
        Jugador jugadores12=new Jugador(concurso,12);
        Jugador jugadores13=new Jugador(concurso,13);
        Jugador jugadores14=new Jugador(concurso,14);
        Jugador jugadores15=new Jugador(concurso,15);
        Jugador jugadores16=new Jugador(concurso,16);
        Jugador jugadores17=new Jugador(concurso,17);
        Jugador jugadores18=new Jugador(concurso,18);
        Jugador jugadores19=new Jugador(concurso,19);
        Jugador jugadores20=new Jugador(concurso,20);

            trabajador1.start();
            trabajador2.start();
            jugadores1.start();
            jugadores2.start();
            jugadores3.start();
            jugadores4.start();
            jugadores5.start();
            jugadores6.start();
            jugadores7.start();
            jugadores8.start();
            jugadores9.start();
            jugadores10.start();
            jugadores11.start();
            jugadores12.start();
            jugadores13.start();
            jugadores14.start();
            jugadores15.start();
            jugadores16.start();
            jugadores17.start();
            jugadores18.start();
            jugadores19.start();
            jugadores20.start();


    }
}
