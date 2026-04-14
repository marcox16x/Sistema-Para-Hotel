package Interfaces_ISP;

public class Main {
        public static void main(String[] args) {

        // Uso de pago
        IPago pago = new PagoEfectivo();
        pago.procesarPago(120);

        // Uso de limpieza
        ILimpieza limpieza = new ServicioLimpieza();
        limpieza.limpiarHabitacion(101);
    }
}
