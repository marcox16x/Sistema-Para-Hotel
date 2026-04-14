package Factura_SRP;

// Clase Factura, tiene una responsabilidad calcular el total
public class Factura {

    private double montoBase;
    private double impuestos;

    // Constructor
    public Factura(double montoBase, double impuestos) {
        this.montoBase = montoBase;
        this.impuestos = impuestos;
    }

    // Metodo principal 
    public double calcularTotal() {
        return montoBase + impuestos;
    }

    // Getters 
    public double getMontoBase() {
        return montoBase;
    }

    public double getImpuestos() {
        return impuestos;
    }
}