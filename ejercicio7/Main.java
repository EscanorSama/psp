package ejercicio7;

public class Main {
    public static void main(String[] args) {
        Thread conejo=new Thread(new Hilo());
        Thread tortuga=new Thread(new Hilo());
        conejo.setName("Conejo");
        tortuga.setName("Tortuga");

        conejo.start();
        tortuga.start();}


}
