package hotel;

public class CheckInService {
    public void realizarCheckIn(Reserva reserva) {
        if (!reserva.isConfirmada()) {
            throw new IllegalStateException("La reserva debe estar confirmada antes del check-in.");
        }
        reserva.registrarCheckIn();
    }
}
