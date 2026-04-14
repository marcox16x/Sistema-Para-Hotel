package Interfaces_ISP;

public class PagoEfectivo implements IPago {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago en efectivo: S/ " + monto);
    }
}
