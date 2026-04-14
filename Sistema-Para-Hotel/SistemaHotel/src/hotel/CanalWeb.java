package hotel;

public class CanalWeb implements CanalReserva {
    @Override
    public String getNombre() {
        return "Pagina web";
    }

    @Override
    public double calcularAnticipo(double total) {
        return total * 0.30;
    }

    @Override
    public boolean requiereConfirmacionAutomatica() {
        return true;
    }
}
