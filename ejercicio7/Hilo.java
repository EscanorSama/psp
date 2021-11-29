package ejercicio7;

import java.util.Random;

public class Hilo implements Runnable {
    Random random = new Random();
    int nCasillas = 70;
    int casilla = 1;
    int turno;
    public static boolean correr = true;
    boolean conejo, tortuga = false;

    @Override
    public void run() {
        while (correr) {

            if (Thread.currentThread().getName() == "Tortuga") {
                turno = random.nextInt(101);
                if (turno > 80) {
                    if (casilla >= 6 + 1) {
                        casilla -= 6;
                        System.out.println("La tortuga se ha movido: " + -6 + " casillas. Va por la casilla: "+casilla);
                    } else {
                        System.out.println("La tortuga se ha movido: " + -6 + " casillas. Va por la casilla: "+casilla);
                        casilla = 1;
                    }
                } else if (turno < 30) {
                    casilla += 1;
                    System.out.println("La tortuga se ha movido: " + 1 + " casillas. Va por la casilla: "+casilla);
                } else {
                    casilla += 3;
                    System.out.println("La tortuga se ha movido: " + 3 + " casillas. Va por la casilla: "+casilla);
                }
                if (casilla >= nCasillas) {
                    System.out.println("La tortuga ha llegado a la meta.");
                    tortuga = true;
                }
            } else if (Thread.currentThread().getName() == "Conejo") {
                turno = random.nextInt(101);
                if (turno > 80) {
                    System.out.println("El conejo se ha movido: " + 0 + " casillas. Va por la casilla: "+casilla);
                } else if (turno < 20) {
                    casilla += 9;
                    System.out.println("El conejo se ha movido: " + 9 + " casillas. Va por la casilla: "+casilla);
                } else if (turno < 40 && turno >= 20) {
                    if (casilla >= 2 + 1) {
                        casilla -= 2;
                        System.out.println("El conejo se ha movido: " + -2 + " casillas. Va por la casilla: "+casilla);
                    } else {
                        casilla = 1;
                        System.out.println("El conejo se ha movido: " + -2 + " casillas. Va por la casilla: "+casilla);
                    }
                } else if (turno < 50 && turno >= 40) {
                    if (casilla >= 12 + 1) {
                        casilla -= 12;
                        System.out.println("El conejo se ha movido: " + -12 + " casillas. Va por la casilla: "+casilla);
                    } else {
                        casilla = 1;
                        System.out.println("El conejo se ha movido: " + -12 + " casillas. Va por la casilla: "+casilla);
                    }
                } else {
                    casilla += 1;
                    System.out.println("El conejo se ha movido: " + 1 + " casillas. Va por la casilla: "+casilla);
                }
                if (casilla >= nCasillas) {
                    System.out.println("El conejo ha llegado a la meta.");
                    conejo = true;


                }


            }
            if (casilla >= nCasillas) {
                correr = false;
                if (conejo && tortuga) {
                    System.out.println("Empate.");
                } else if (conejo) {
                    System.out.println("Gana el conejo.");
                } else if (tortuga) {
                    System.out.println("Gana la tortuga.");
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
