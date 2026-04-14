package hotel;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class CalculadoraPrecio {
    private final List<PoliticaPrecio> politicas;

    public CalculadoraPrecio(List<PoliticaPrecio> politicas) {
        this.politicas = politicas;
    }

    public double calcular(Habitacion habitacion, Cliente cliente, LocalDate entrada, LocalDate salida) {
        long noches = ChronoUnit.DAYS.between(entrada, salida);
        double precio = habitacion.getTarifaBase() * noches;

        for (PoliticaPrecio politica : politicas) {
            precio = politica.aplicar(precio, habitacion, cliente, entrada, salida);
        }

        return precio;
    }
}
