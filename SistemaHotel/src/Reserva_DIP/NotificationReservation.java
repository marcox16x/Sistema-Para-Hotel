
package Reserva_DIP;

public class NotificationReservation {
    private Reserva reserva;
    
    public NotificationReservation(Reserva reservation){
        this.reserva=reservation;
    }
    public void sendNotification(int num, String type){
        reserva.reservation(num, type);
    }
}
