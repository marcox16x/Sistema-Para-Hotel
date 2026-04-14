
package Reserva_DIP;

public class RoomAvailable implements Reserva{

    @Override
    public void reservation(int num, String type) {
        System.out.println("Habitacion disponible: N: "+num + " tipo: "+type);
    }  
}
