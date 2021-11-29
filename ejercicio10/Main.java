package ejercicio10;

public class Main {
    public static void main(String[] args) {
        CuentaComun cuentaComun=new CuentaComun(100);
        Persona persona1=new Persona("Ana",cuentaComun,200);
        Persona persona2=new Persona("Juan",cuentaComun,-160);
        Persona persona3=new Persona("Carlos",cuentaComun,-140);
        persona1.run();
        persona2.run();
        persona3.run();
    }
}
