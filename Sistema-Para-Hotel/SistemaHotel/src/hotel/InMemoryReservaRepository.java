package hotel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class InMemoryReservaRepository implements ReservaConsultaRepository, ReservaComandoRepository {
    private final List<Reserva> reservas = new ArrayList<>();

    @Override
    public List<Reserva> buscarReservasDeHabitacion(String numeroHabitacion, LocalDate entrada, LocalDate salida) {
        List<Reserva> resultado = new ArrayList<>();
        for (Reserva reserva : reservas) {
            boolean mismaHabitacion = reserva.getHabitacion().getNumero().equals(numeroHabitacion);
            boolean cruzaFechas = entrada.isBefore(reserva.getFechaSalida()) && salida.isAfter(reserva.getFechaEntrada());
            if (mismaHabitacion && cruzaFechas) {
                resultado.add(reserva);
            }
        }
        return resultado;
    }

    @Override
    public void guardar(Reserva reserva) {
        reservas.add(reserva);
    }
}
