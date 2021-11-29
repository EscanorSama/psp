package ejercicio10;

public class Persona extends Thread{
    CuentaComun cuentaComun;
    String nombre;
    int cantidad;
    public Persona(String nombre,CuentaComun cuentaComun,int c){
        this.cuentaComun=cuentaComun;
        this.nombre=nombre;
        this.cantidad=c;
    }

    @Override
    public void run() {
        super.run();
        if(cantidad<0){
            cantidad*=(-1);
            cuentaComun.retirar(cantidad,nombre);

        }
        else if(cantidad>0){
            cuentaComun.ingresar(cantidad,nombre);
        }
        else{
            System.out.println("Gracias por perder su tiempo.");
        }
    }
}
