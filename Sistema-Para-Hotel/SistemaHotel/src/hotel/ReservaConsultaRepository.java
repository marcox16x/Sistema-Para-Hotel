package hotel;

import java.time.LocalDate;
import java.util.List;

public interface ReservaConsultaRepository {
    List<Reserva> buscarReservasDeHabitacion(String numeroHabitacion, LocalDate entrada, LocalDate salida);
}
