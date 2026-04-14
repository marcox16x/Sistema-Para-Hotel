package Habitacion_LSP;

public class HabitacionPremium extends Habitacion implements DesayunoIncluido {
    @Override
    public void incluirDesayuno() {
        System.out.println("Desayuno incluido en habitacion premium");
    }
    
}
