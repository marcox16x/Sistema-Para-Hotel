package hotel;

import java.util.List;

public interface HabitacionConsultaRepository {
    List<Habitacion> listarPorTipo(TipoHabitacion tipo);
}
