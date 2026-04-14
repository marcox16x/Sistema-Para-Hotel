package hotel;

import java.time.LocalDate;

public class PoliticaConvenioCorporativo implements PoliticaPrecio {
    @Override
    public double aplicar(double precioActual, Habitacion habitacion, Cliente cliente, LocalDate entrada, LocalDate salida) {
        if (cliente.tieneConvenioCorporativo()) {
            return precioActual * 0.85;
        }
        return precioActual;
    }
}
