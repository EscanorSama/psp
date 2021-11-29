import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Hilo implements Runnable{

    static String[]args={"3","7"};
    static int menor=Integer.parseInt(args[0]);
    static int mayor=Integer.parseInt(args[1]);
    static int archivo=0;

    @Override
    public void run() {
        if (Thread.currentThread().getName().equals("sumasProcesos")){
            obtenerNumeros.main(args);

        }
        else{
            for (int j = 0; j < 125; j++) {
                archivo++;
                File directorio;
                FileWriter writer;
                int suma=0;
                for(int i=Integer.parseInt(args[0]);i<=Integer.parseInt(args[1]);i++){suma+=i;}

                directorio = new File("E:\\ces\\2\\java\\ejercicioHilosRepaso\\Resultados2\\suma" + archivo + ".txt");
                try {
                    writer = new FileWriter(directorio);
                    writer.write(String.valueOf(suma));
                    writer.flush();
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                menor+=5;
                mayor+=5;
            }
            

        }
    }
}
