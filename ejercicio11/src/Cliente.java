import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Cliente {
    public static void main(String[] args) {
        int puerto=80;
        String host="localhost";
        Persona persona=new Persona("caca3",1200);
        InetSocketAddress address=new InetSocketAddress(host,puerto);
        Socket cliente=new Socket();
        try {
            cliente.connect(address);
            ObjectOutputStream ooS=new ObjectOutputStream(cliente.getOutputStream());
            ooS.writeObject(persona);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
