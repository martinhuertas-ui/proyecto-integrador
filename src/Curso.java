import java.util.ArrayList;
import java.util.List;

public class Curso implements IMostrable, IReportable {
    private String nombre;
    private Profesor profesor;
    private List<Matricula> matriculas;

    public Curso(String nombre, Profesor profesor) {
        setNombre(nombre);
        this.profesor = profesor;
        this.matriculas = new ArrayList<>();
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre.trim();
        } else {
            this.nombre = "SIN-NOMBRE";
        }
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public void agregarMatricula(Matricula m) {
        if (m != null) {
            matriculas.add(m);
        }
    }

    public List<Matricula> getMatriculas() {
        return new ArrayList<>(matriculas);
    }

    public void mostrarPromedio() {
        if (matriculas.isEmpty()) {
            System.out.println("No hay matrículas en el curso.");
            return;
        }
        double suma = 0.0;
        for (Matricula m : matriculas) {
            suma += m.getNotaFinal();
        }
        double promedio = suma / matriculas.size();
        System.out.println("Promedio del curso " + nombre + ": " + promedio);
    }

    public void notificarPeligroDePerder() {
        boolean hayRiesgo = false;
        for (Matricula m : matriculas) {
            if (m.getNotaFinal() < 3.0) {
                System.out.println("⚠ Atención: una matrícula tiene nota en riesgo (" + m.getNotaFinal() + ")");
                hayRiesgo = true;
            }
        }
        if (!hayRiesgo) {
            System.out.println("Todos los estudiantes están en buen estado.");
        }
    }

    // Implementaciones de interfaces
    @Override
    public String mostrarInformacion() {
        return String.format("Curso: %s | Profesor: %s | Matrículas: %d",
                nombre,
                (profesor != null ? profesor.getNombre() : "SIN PROFESOR"),
                matriculas.size());
    }

    @Override
    public String generarReporte() {
        StringBuilder sb = new StringBuilder();
        sb.append("Reporte del curso: ").append(nombre).append("\n");
        sb.append("Profesor: ").append(profesor != null ? profesor.getNombre() : "SIN PROFESOR").append("\n");
        sb.append("Número de matrículas: ").append(matriculas.size()).append("\n");
        for (Matricula m : matriculas) {
            sb.append(" - ").append(m.mostrarInformacion()).append("\n");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return mostrarInformacion();
    }
}

