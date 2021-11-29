import java.io.*;
import java.net.Socket;
import java.util.Collections;

public class HiloServidor extends Thread{

    Socket cliente;
    ObjectInputStream oIS;
    public static boolean borrar;
    public HiloServidor(Socket cliente){
        this.cliente=cliente;
        try {
            this.oIS=new ObjectInputStream(cliente.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @Override
    public void run() {
        super.run();
        System.out.println("Se ha unido: "+cliente.getInetAddress().toString());
        try {
            Persona persona=(Persona) oIS.readObject();
            Servidor.clientes.add(persona);
            borrar=Servidor.clientes.size()==4? true:false;
            if (borrar){
                for (Persona per:Servidor.clientes) {
                    Servidor.puntuaciones.add(persona.puntuacion);
                }
                Collections.sort(Servidor.puntuaciones);
                Collections.reverse(Servidor.puntuaciones);

                for (Persona per:Servidor.clientes) {
                    for (int p:Servidor.puntuaciones) {
                        if(p== persona.puntuacion){
                            String t="{'nombre':"+persona.nombre+",'puntuacion':"+persona.puntuacion+"}";
                            Servidor.txt.add(t);
                            break;
                        }

                    }

                }
                Servidor.puntuaciones.clear();
                Servidor.clientes.clear();
                File salida = new File("datos.txt");
                FileWriter writer = new FileWriter(salida);
                for (String t:Servidor.txt) {
                    writer.write(t);
                    writer.flush();
                }
                Servidor.txt.clear();
                writer.close();


            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
