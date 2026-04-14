package hotel;

public interface CanalReserva {
    String getNombre();

    double calcularAnticipo(double total);

    boolean requiereConfirmacionAutomatica();
}
