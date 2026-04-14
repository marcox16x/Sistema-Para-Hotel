package hotel;

import Pago.PagoTarjeta;
import java.time.LocalDate;
import java.util.Arrays;

public class MainHotel {
    public static void main(String[] args) {
        InMemoryHabitacionRepository habitacionRepository = new InMemoryHabitacionRepository();
        InMemoryReservaRepository reservaRepository = new InMemoryReservaRepository();

        habitacionRepository.guardar(new Habitacion("101", TipoHabitacion.SIMPLE, 120));
        habitacionRepository.guardar(new Habitacion("201", TipoHabitacion.SUITE, 350));

        CalculadoraPrecio calculadoraPrecio = new CalculadoraPrecio(Arrays.asList(
                new PoliticaTemporadaAlta(),
                new PoliticaClienteFrecuente(),
                new PoliticaConvenioCorporativo()
        ));

        DisponibilidadService disponibilidadService = new DisponibilidadService(habitacionRepository, reservaRepository);
        ReservaService reservaService = new ReservaService(disponibilidadService, calculadoraPrecio, reservaRepository);

        Cliente cliente = new Cliente("76543210", "Ana Torres", true, "Empresa ABC");
        Reserva reserva = reservaService.crearReserva(
                "R-001",
                cliente,
                TipoHabitacion.SUITE,
                LocalDate.of(2026, 7, 10),
                LocalDate.of(2026, 7, 12),
                new CanalWeb()
        );

        System.out.println("Reserva creada para: " + reserva.getCliente().getNombre());
        System.out.println("Habitacion asignada: " + reserva.getHabitacion().getNumero());
        System.out.println("Canal: " + reserva.getCanal().getNombre());
        System.out.println("Anticipo: S/ " + reserva.getCanal().calcularAnticipo(reserva.getTotal()));
        System.out.println("Total: S/ " + reserva.getTotal());

        CheckInService checkInService = new CheckInService();
        checkInService.realizarCheckIn(reserva);

        FacturacionService facturacionService = new FacturacionService(new PagoTarjeta());
        facturacionService.cobrarReserva(reserva);
    }
}
