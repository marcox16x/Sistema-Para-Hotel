package hotel;

import java.time.LocalDate;

public class ReservaService {
    private final DisponibilidadService disponibilidadService;
    private final CalculadoraPrecio calculadoraPrecio;
    private final ReservaComandoRepository reservaRepository;

    public ReservaService(DisponibilidadService disponibilidadService, CalculadoraPrecio calculadoraPrecio,
            ReservaComandoRepository reservaRepository) {
        this.disponibilidadService = disponibilidadService;
        this.calculadoraPrecio = calculadoraPrecio;
        this.reservaRepository = reservaRepository;
    }

    public Reserva crearReserva(String codigo, Cliente cliente, TipoHabitacion tipo, LocalDate entrada,
            LocalDate salida, CanalReserva canal) {
        Habitacion habitacion = disponibilidadService.buscarDisponible(tipo, entrada, salida);
        double total = calculadoraPrecio.calcular(habitacion, cliente, entrada, salida);
        Reserva reserva = new Reserva(codigo, cliente, habitacion, entrada, salida, canal, total);

        if (canal.requiereConfirmacionAutomatica()) {
            reserva.confirmar();
        }

        reservaRepository.guardar(reserva);
        return reserva;
    }
}
