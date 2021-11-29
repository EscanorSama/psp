package ejercicio10;

public class CuentaComun {
    int cantidadInicial=100;
    int cantidadActual=cantidadInicial;
    public CuentaComun(int cantidadInicial){
        this.cantidadInicial=cantidadInicial;
    }
    synchronized void retirar(int c,String n){
        if (cantidadActual>=c){
            for (int i = 0; i < (c/10); i++) {
                cantidadActual-=10;
                System.out.println(n+" retira 10€");

            }
            System.out.println(n+" retira un total de "+c+". Saldo de la cuenta: "+cantidadActual);
        }
    }
    synchronized void ingresar(int c,String n){
        cantidadActual+=c;
        System.out.println(n+" ingresa un total de "+c+". Saldo de la cuenta: "+cantidadActual);
    }
}
