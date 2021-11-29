package ejercicio9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Concurso {

    LinkedList<Integer> numeros=new LinkedList<>();
    public Concurso(LinkedList<Integer> numeros){
        this.numeros=numeros;
    }
    boolean disponible=false;

    synchronized void setNumber(int num){
        while (disponible){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        numeros.addFirst(num);
        if(numeros.size()==2){
        disponible=true;}
        notifyAll();
        System.out.println("Numero producido: "+num);



    }
    synchronized void getNumber(int num,int id){
        while (!disponible){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if(num==numeros.getLast()){
            System.out.println("Numero acertado por el jugador"+id+": "+num);
            numeros.removeLast();
            if (numeros.size()==0){
            disponible=false;}

        }
        notifyAll();
        System.out.println("El jugador"+id+" dice: "+num);
    }


}
