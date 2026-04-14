package Pago;

//Esta clase implementara el pago en efectivo
public class PagoEfectivo implements Pago {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago realizado en efectivo por: S/ " + monto);
    }
}
