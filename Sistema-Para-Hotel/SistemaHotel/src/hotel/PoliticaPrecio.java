package hotel;

import java.time.LocalDate;

public interface PoliticaPrecio {
    double aplicar(double precioActual, Habitacion habitacion, Cliente cliente, LocalDate entrada, LocalDate salida);
}
