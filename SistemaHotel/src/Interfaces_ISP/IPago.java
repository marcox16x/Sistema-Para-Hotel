package Interfaces_ISP;

// Interfaz específica solo para pagos
// Cumple ISP, no mezcla responsabilidades
public interface IPago {
    void procesarPago(double monto);
}
