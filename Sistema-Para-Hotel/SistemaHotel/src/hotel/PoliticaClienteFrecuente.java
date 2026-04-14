package hotel;

import java.time.LocalDate;

public class PoliticaClienteFrecuente implements PoliticaPrecio {
    @Override
    public double aplicar(double precioActual, Habitacion habitacion, Cliente cliente, LocalDate entrada, LocalDate salida) {
        if (cliente.isFrecuente()) {
            return precioActual * 0.90;
        }
        return precioActual;
    }
}
