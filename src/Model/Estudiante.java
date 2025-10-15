package Model;

import Interfaces.IMostrable;

import java.util.ArrayList;
import java.util.List;

public class Estudiante extends Persona implements IMostrable {
    private String codigoEstudiantil;
    private double puntaje;
    private String estado;
    private final List<Nota> notas = new ArrayList<>();

    public Estudiante(String id, String nombre, int edad, String correo, String telefono, String codigoEstudiantil) {
        super(id, nombre, edad, correo, telefono);
        this.codigoEstudiantil = (codigoEstudiantil != null && !codigoEstudiantil.trim().isEmpty())
                ? codigoEstudiantil.trim() : "SIN-CODIGO";
        this.puntaje = 0.0;
        this.estado = "activo";
    }

    public Estudiante(String nombre, int edad, String codigoEstudiantil, String correo, String telefono) {
        super("", nombre, edad, correo, telefono);
        this.codigoEstudiantil = (codigoEstudiantil != null) ? codigoEstudiantil : "SIN-CODIGO";
        this.puntaje = 0.0;
        this.estado = "activo";
    }

    // Getters / Setters (encapsulamiento y validación simple)
    public String getCodigoEstudiantil() { return codigoEstudiantil; }
    public void setCodigoEstudiantil(String codigoEstudiantil) {
        if (codigoEstudiantil != null && !codigoEstudiantil.trim().isEmpty()) {
            this.codigoEstudiantil = codigoEstudiantil.trim();
        }
    }

    public double getPuntaje() { return puntaje; }
    public void setPuntaje(double puntaje) {
        if (puntaje >= 0.0 && puntaje <= 5.0) {
            this.puntaje = puntaje;
        }
    }

    public String getEstado() { return estado; }
    public void setEstado(String estado) {
        if (estado != null && !estado.trim().isEmpty()) {
            this.estado = estado.trim();
        }
    }

    public List<Nota> getNotas() {
        return new ArrayList<>(notas);
    }

    public void agregarNota(Nota n) {
        if (n == null) return;
        notas.add(n);
        recalcularPromedio();
    }

    private void recalcularPromedio() {
        if (notas.isEmpty()) {
            puntaje = 0.0;
            estado = "activo";
            return;
        }
        double suma = 0.0;
        for (Nota n : notas) suma += n.getValor();
        puntaje = suma / notas.size();
        estado = (puntaje < 3.0) ? "en riesgo" : "activo";
    }

    // Implementación de Interfaces.IMostrable (polimorfismo)
    @Override
    public String mostrarInformacion() {
        return String.format("%s - Código:%s - Puntaje:%.2f - Estado:%s",
                super.mostrarInformacion(), codigoEstudiantil, puntaje, estado);
    }

    @Override
    public String toString() {
        return mostrarInformacion();
    }
}

