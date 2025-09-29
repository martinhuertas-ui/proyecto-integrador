public class Notas {
    private String estudiante;
    private double nota;
    private String tipo;

    public Notas(String estudiante, double nota, String tipo) {
        this.estudiante = estudiante;
        this.nota = nota;
        this.tipo = tipo;
    }

    public double getNota() { return nota; }
    public void setNota(double nota) { this.nota = nota; }

    public boolean esAprobatoria() {
        return nota >= 3.0;
    }

    @Override
    public String toString() {
        return String.format("Estudiante:%s - Nota:%.2f - Tipo:%s - Aprobado:%s",
                estudiante, nota, tipo, esAprobatoria());
    }
}