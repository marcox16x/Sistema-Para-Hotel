package hotel;

import Pago.Pago;

public class FacturacionService {
    private final Pago metodoPago;

    public FacturacionService(Pago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public void cobrarReserva(Reserva reserva) {
        metodoPago.procesarPago(reserva.getTotal());
    }
}
