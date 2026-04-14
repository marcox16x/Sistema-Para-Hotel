package Pago_OCP;

// Clase  para probar el sistema
public class Main {
    public static void main(String[] args) {

        // Se crea un pago con tarjeta 
        Pago pago1 = new PagoTarjeta();
        pago1.procesarPago(250.0);

        // Se crea un pago en efectivo
        Pago pago2 = new PagoEfectivo();
        pago2.procesarPago(100.0);

        // Se crea un pago con Yape
        Pago pago3 = new PagoYape();
        pago3.procesarPago(80.0);
    }
}
