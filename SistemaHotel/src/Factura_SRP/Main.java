package Factura_SRP;

public class Main {
    public static void main(String[] args) {

        // Creamos una factura
        Factura factura = new Factura(200, 36);

        // Calculamos el total
        double total = factura.calcularTotal();

        // Mostramos resultado
        System.out.println("Total de la factura: S/ " + total);
    }
}
