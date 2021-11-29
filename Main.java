public class Main {
    public static void main(String[] args) {
        Thread hilo=new Thread(new Hilo());
        Thread hilo1=new Thread(new Hilo());
        Thread hilo2=new Thread(new Hilo());
        Thread hilo3=new Thread(new Hilo());
        Thread hilo4=new Thread(new Hilo());
        hilo.setName("sumasProcesos");
        hilo.start();
        long startTime = System.currentTimeMillis();
        hilo1.start();
        try {
            hilo1.join();
            hilo2.start();
            hilo2.join();
            hilo3.start();
            hilo3.join();
            hilo4.start();
            long endTime = System.currentTimeMillis();
            long duration = (endTime - startTime);
            System.out.println("Hilos took " + duration + " milliseconds");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
