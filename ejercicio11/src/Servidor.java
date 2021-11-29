import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;

public class Servidor {
    public static ArrayList<Persona> clientes=new ArrayList<>();
    public static ArrayList<Integer> puntuaciones=new ArrayList<>();
    public static ArrayList<String> txt=new ArrayList<>();

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket=new ServerSocket(80);
            while (true){
                System.out.println("Esperando...");
                Socket cliente= serverSocket.accept();
                HiloServidor hiloServidor=new HiloServidor(cliente);
                hiloServidor.start();






            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
