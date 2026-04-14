package Pago;

//Clase de metodo de pago con tarjeta
public class PagoTarjeta implements Pago{

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago realizado con tarjeta por: S/ "+monto);
    } 
}
