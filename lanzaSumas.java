import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class lanzaSumas {
    public static void main(String[] args) {
        File directorio;
        FileWriter writer;
        int suma=0;
        for(int i=Integer.parseInt(args[0]);i<=Integer.parseInt(args[1]);i++){suma+=i;}

        directorio = new File("E:\\ces\\2\\java\\ejercicioHilosRepaso\\Resultados\\suma" + args[2] + ".txt");
        try {
            writer = new FileWriter(directorio);
            writer.write(String.valueOf(suma));
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
