package Interfaces_ISP;

public class ServicioLimpieza implements ILimpieza {

    @Override
    public void limpiarHabitacion(int numero) {
        System.out.println("Limpiando habitacion numero: " + numero);
    }
}