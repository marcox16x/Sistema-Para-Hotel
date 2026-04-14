package hotel;

import java.time.LocalDate;
import java.time.Month;

public class PoliticaTemporadaAlta implements PoliticaPrecio {
    @Override
    public double aplicar(double precioActual, Habitacion habitacion, Cliente cliente, LocalDate entrada, LocalDate salida) {
        boolean temporadaAlta = entrada.getMonth() == Month.JULY || entrada.getMonth() == Month.DECEMBER;
        if (temporadaAlta) {
            return precioActual * 1.20;
        }
        return precioActual;
    }
}
