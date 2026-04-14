
package Reserva_DIP;

public class Main {
    public static void main(String[] args) {
        NotificationReservation not1=new NotificationReservation(new RoomAvailable());
        not1.sendNotification(101, "Doble");
        not1.sendNotification(102, "Simple");
        not1.sendNotification(103, "Simple");
        not1.sendNotification(104, "Matrimonial");
        not1.sendNotification(105, "suite");
        
        NotificationReservation not2=new NotificationReservation(new MakeReservation());
        not2.sendNotification(104, "Matrimonial");
        
        NotificationReservation not3=new NotificationReservation(new CancelReservation());
        not3.sendNotification(102, "Simple");
    }
}
