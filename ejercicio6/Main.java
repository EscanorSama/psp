package ejercicio6;

public class Main {
    public static void main(String[] args) {
        int intercambios=9;
        int nProductores=4;
        int nConsumidores=4;
        Cola colaComun = new Cola();


        for (int i = 0; i < intercambios; i++)
        {
            for (int j = 0; j < nProductores; j++) {
                for (int k = 0; k < nConsumidores; k++) {
                    Productor productor = new Productor(colaComun);
                    productor.start();
                    Consumidor consumidor = new Consumidor(colaComun);
                    consumidor.start();

                }

            }

    }
    }
}
