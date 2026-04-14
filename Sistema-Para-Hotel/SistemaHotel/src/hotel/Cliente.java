package hotel;

public class Cliente {
    private final String documento;
    private final String nombre;
    private final boolean frecuente;
    private final String empresaConvenio;

    public Cliente(String documento, String nombre, boolean frecuente, String empresaConvenio) {
        this.documento = documento;
        this.nombre = nombre;
        this.frecuente = frecuente;
        this.empresaConvenio = empresaConvenio;
    }

    public String getDocumento() {
        return documento;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isFrecuente() {
        return frecuente;
    }

    public String getEmpresaConvenio() {
        return empresaConvenio;
    }

    public boolean tieneConvenioCorporativo() {
        return empresaConvenio != null && !empresaConvenio.isBlank();
    }
}
