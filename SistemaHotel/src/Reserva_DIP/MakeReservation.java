
package Reserva_DIP;

public class MakeReservation implements Reserva{

    @Override
    public void reservation(int num, String type) {
        System.out.println("Hacer reservacion para habitacion "+num+ " tipo "+type);
    }
}
