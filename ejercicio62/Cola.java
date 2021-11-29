package ejercicio62;

import java.util.LinkedList;

public class Cola{

    final int NUMERO_MAX=10;
    LinkedList<Integer> list;
    public Cola(LinkedList<Integer>list){this.list=list;}
    synchronized Integer get(){
        while (list.isEmpty()){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Integer numSacado=list.removeLast();
        System.out.println("Consumidor "+Thread.currentThread().getName()+" ha consumido: "+numSacado);
        notifyAll();
        return numSacado;
    }
    synchronized public void put(Integer num){
        while(list.size()==NUMERO_MAX){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        list.addFirst(num);
        System.out.println("Productor "+Thread.currentThread().getName()+" ha producido: "+num);
        notifyAll();
    }




}
