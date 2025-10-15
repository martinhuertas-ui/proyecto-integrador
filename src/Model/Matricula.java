package Model;

import Interfaces.IMostrable;

import java.time.LocalDate;

public class Matricula implements IMostrable {
    private LocalDate fecha;
    private String estado;
    private double notaFinal;

    public Matricula(LocalDate fecha, String estado, double notaFinal) {
        setFecha(fecha);
        setEstado(estado);
        setNotaFinal(notaFinal);
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        if (fecha != null) {
            this.fecha = fecha;
        } else {
            this.fecha = LocalDate.now();
        }
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        if (estado != null && !estado.trim().isEmpty()) {
            this.estado = estado.trim();
        } else {
            this.estado = "sin estado";
        }
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        if (notaFinal >= 0.0 && notaFinal <= 5.0) {
            this.notaFinal = notaFinal;
        } else {
            this.notaFinal = 0.0;
        }
    }

    @Override
    public String mostrarInformacion() {
        return String.format("Matrícula [%s] - Estado:%s - Model.Nota Final: %.2f",
                fecha, estado, notaFinal);
    }

    @Override
    public String toString() {
        return mostrarInformacion();
    }
}
