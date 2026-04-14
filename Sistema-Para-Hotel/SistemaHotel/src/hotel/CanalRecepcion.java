package hotel;

public class CanalRecepcion implements CanalReserva {
    @Override
    public String getNombre() {
        return "Recepcion";
    }

    @Override
    public double calcularAnticipo(double total) {
        return 0;
    }

    @Override
    public boolean requiereConfirmacionAutomatica() {
        return false;
    }
}
