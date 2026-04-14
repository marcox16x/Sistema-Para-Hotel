package hotel;

import java.time.LocalDate;
import java.util.List;

public class DisponibilidadService {
    private final HabitacionConsultaRepository habitacionRepository;
    private final ReservaConsultaRepository reservaRepository;

    public DisponibilidadService(HabitacionConsultaRepository habitacionRepository,
            ReservaConsultaRepository reservaRepository) {
        this.habitacionRepository = habitacionRepository;
        this.reservaRepository = reservaRepository;
    }

    public Habitacion buscarDisponible(TipoHabitacion tipo, LocalDate entrada, LocalDate salida) {
        List<Habitacion> habitaciones = habitacionRepository.listarPorTipo(tipo);
        for (Habitacion habitacion : habitaciones) {
            boolean disponiblePorEstado = habitacion.getEstado() == EstadoHabitacion.DISPONIBLE;
            boolean sinCruceDeReservas = reservaRepository
                    .buscarReservasDeHabitacion(habitacion.getNumero(), entrada, salida)
                    .isEmpty();

            if (disponiblePorEstado && sinCruceDeReservas) {
                return habitacion;
            }
        }
        throw new IllegalStateException("No hay habitaciones disponibles para el tipo solicitado.");
    }
}
