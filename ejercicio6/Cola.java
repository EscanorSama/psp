package ejercicio6;

import java.util.Random;

public class Cola {

    int[] almacen = {0, 0, 0, 0,0, 0, 0, 0,0, 0, 0, 0,0, 0, 0, 0};
    boolean lleno = false;
    boolean vacio = true;
    boolean disponible;
    int capacidad=120;

    int jAl;



    synchronized void almacenar(int producto) {
        System.out.println("Se quiere almacenar: "+producto);
        for (int i = 0; i < almacen.length; i++) {

            if (almacen[i] == capacidad) {
                lleno = true;
            } else {
                lleno = false;
                break;
            }
        }
        if(lleno){
            disponible=true;
        }
        else {disponible=false;}
        while (disponible) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }


            for (int j = 0; j < almacen.length; j++) {
                System.out.println("Almacenamiento. El estante "+(j+1)+" tiene "+almacen[j]+" paquetes.");
                if (!(almacen[j] >= capacidad)) {
                    if((almacen[j]+producto)>capacidad){
                        int resto=capacidad-almacen[j];
                        producto-=resto;
                        jAl = j + 1;
                        almacen[j] += resto;
                        System.out.println("Se han almacenado: " + resto + " en la estanteria " + jAl);
                    }
                    else{jAl = j + 1;
                        almacen[j] += producto;
                        System.out.println("Se han almacenado: " + producto + " en la estanteria " + jAl);
                        break;}


                }

            }
            vacio=false;

            notify();



        }

        synchronized void quitar(int retiro) {
            System.out.println("Se quiere retirar: "+retiro);
            for (int i = 0; i < almacen.length; i++) {
                if (almacen[i] == 0) {
                    vacio = true;
                } else {
                    vacio = false;
                    break;
                }
            }
            if(vacio){
                disponible=false;
            }
            else{disponible=true;}
            while (!disponible){
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            for (int j = 0; j < almacen.length; j++) {
                System.out.println("Retirada. El estante "+(j+1)+" tiene "+almacen[j]+" paquetes.");
                if (!(almacen[j] == 0)) {
                    if((almacen[j])<retiro){
                        int resto=retiro-almacen[j];
                        retiro=resto;
                        jAl = j + 1;
                        almacen[j] -= resto;
                        System.out.println("Se han retirado: " + resto + " de la estanteria " + jAl);
                    }
                    else{jAl = j + 1;
                        almacen[j] -= retiro;
                        System.out.println("Se han retirado: " + retiro + " de la estanteria " + jAl);
                        break;}


                }

            }
            lleno=false;

            notify();




        }
    }

