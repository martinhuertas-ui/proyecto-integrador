public class Nota implements IMostrable {
    private double valor;
    private String descripcion;

    public Nota(double valor, String descripcion) {
        setValor(valor);
        setDescripcion(descripcion);
    }

    // Getters y Setters con validación
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if (valor >= 0.0 && valor <= 5.0) {
            this.valor = valor;
        } else {
            this.valor = 0.0; // valor por defecto
        }
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        if (descripcion != null && !descripcion.trim().isEmpty()) {
            this.descripcion = descripcion.trim();
        } else {
            this.descripcion = "Sin descripción";
        }
    }

    // Implementación de IMostrable
    @Override
    public String mostrarInformacion() {
        return String.format("Nota: %.2f (%s)", valor, descripcion);
    }

    @Override
    public String toString() {
        return mostrarInformacion();
    }
}
