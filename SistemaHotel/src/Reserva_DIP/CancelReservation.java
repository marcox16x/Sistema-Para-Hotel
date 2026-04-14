
package Reserva_DIP;

public class CancelReservation implements Reserva{

    @Override
    public void reservation(int num, String type) {
        System.out.println("Cancelar habitacion "+num+ " tipo "+type);
    }
    
}
