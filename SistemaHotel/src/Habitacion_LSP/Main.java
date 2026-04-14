
package Habitacion_LSP;

public class Main {

    public static void main(String[] args) {
        Habitacion h1 = new HabitacionSimple();
        Habitacion h2 = new HabitacionPremium();

        h1.reservar();
        h2.reservar();
    }

}
