package Pago;

//Clase metodo de pago con yape
public class PagoYape implements Pago {

    @Override
    public void procesarPago(double monto) {
        // Simulación de pago con billetera digital
        System.out.println("Pago realizado con yape por: S/ " + monto);
    }
}
