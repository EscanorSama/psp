import java.io.File;
import java.io.IOException;

public class obtenerNumeros {
    public static void main(String[] args) {
        int menor=Integer.parseInt(args[0]);
        //int menor=3;
        int mayor=Integer.parseInt(args[1]);
        //int mayor=7;
        int nSumas=500;
        long startTime = System.currentTimeMillis();


        if(menor>mayor){
            int cambio=mayor;
            mayor=menor;
            menor=cambio;
        }
        ProcessBuilder pb;
        for (int i=0;i<nSumas;i++){

            pb=new ProcessBuilder("java","lanzaSumas",String.valueOf(menor),String.valueOf(mayor),String.valueOf(i+1));
            pb.directory(new File("E:\\ces\\2\\java\\ejercicioHilosRepaso\\out\\production\\ejercicioHilosRepaso"));
            try {

                pb.start();


                /*Process p = pb.start();
                InputStream iS = p.getInputStream();
                InputStreamReader iSR = new InputStreamReader(iS);
                BufferedReader bf = new BufferedReader(iSR);
                String mensaje = "";


                while ((mensaje = bf.readLine()) != null) {
                    System.out.println(mensaje);


                }
                bf.close();
                iSR.close();
                iS.close();*/
                menor+=5;
                mayor+=5;
            } catch (IOException e) {
                e.printStackTrace();
            }





        }

        long endTime = System.currentTimeMillis();
        long duration = (endTime - startTime);
        System.out.println("Process took " + duration + " milliseconds");}
}
