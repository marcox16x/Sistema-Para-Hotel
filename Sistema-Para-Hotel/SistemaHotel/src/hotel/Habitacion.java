package hotel;

public class Habitacion {
    private final String numero;
    private final TipoHabitacion tipo;
    private final double tarifaBase;
    private EstadoHabitacion estado;

    public Habitacion(String numero, TipoHabitacion tipo, double tarifaBase) {
        this.numero = numero;
        this.tipo = tipo;
        this.tarifaBase = tarifaBase;
        this.estado = EstadoHabitacion.DISPONIBLE;
    }

    public String getNumero() {
        return numero;
    }

    public TipoHabitacion getTipo() {
        return tipo;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    public EstadoHabitacion getEstado() {
        return estado;
    }

    public void cambiarEstado(EstadoHabitacion estado) {
        this.estado = estado;
    }
}
