package hotel;

import java.util.ArrayList;
import java.util.List;

public class InMemoryHabitacionRepository implements HabitacionConsultaRepository, HabitacionComandoRepository {
    private final List<Habitacion> habitaciones = new ArrayList<>();

    @Override
    public List<Habitacion> listarPorTipo(TipoHabitacion tipo) {
        List<Habitacion> resultado = new ArrayList<>();
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getTipo() == tipo) {
                resultado.add(habitacion);
            }
        }
        return resultado;
    }

    @Override
    public void guardar(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }
}
