package hotel;

import java.time.LocalDate;

public class Reserva {
    private final String codigo;
    private final Cliente cliente;
    private final Habitacion habitacion;
    private final LocalDate fechaEntrada;
    private final LocalDate fechaSalida;
    private final CanalReserva canal;
    private final double total;
    private boolean confirmada;
    private boolean checkInRealizado;

    public Reserva(String codigo, Cliente cliente, Habitacion habitacion, LocalDate fechaEntrada,
            LocalDate fechaSalida, CanalReserva canal, double total) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.canal = canal;
        this.total = total;
    }

    public String getCodigo() {
        return codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public CanalReserva getCanal() {
        return canal;
    }

    public double getTotal() {
        return total;
    }

    public boolean isConfirmada() {
        return confirmada;
    }

    public boolean isCheckInRealizado() {
        return checkInRealizado;
    }

    public void confirmar() {
        confirmada = true;
    }

    public void registrarCheckIn() {
        checkInRealizado = true;
        habitacion.cambiarEstado(EstadoHabitacion.OCUPADA);
    }

    public void registrarCheckOut() {
        checkInRealizado = false;
        habitacion.cambiarEstado(EstadoHabitacion.LIMPIEZA);
    }
}
