import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nombre;
    private Profesor profesor;
    private int maxEstudiantes;
    private List<Estudiante> estudiantes;

    public Curso(String nombre, Profesor profesor) {
        this(nombre, profesor, 100); // límite por defecto
    }

    public Curso(String nombre, Profesor profesor, int maxEstudiantes) {
        this.nombre = nombre;
        this.profesor = profesor;
        this.maxEstudiantes = maxEstudiantes;
        this.estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante e) {
        if (estudiantes.size() >= maxEstudiantes) {
            System.out.println("Curso lleno: no se puede agregar más estudiantes.");
            return;
        }
        if (!estudiantes.contains(e)) {
            estudiantes.add(e);
            System.out.printf("Estudiante %s inscrito en %s%n", e.getNombre(), nombre);
        }
    }

    public void mostrarEstudiantes() {
        System.out.println("Estudiantes en el curso " + nombre + ":");
        for (Estudiante e : estudiantes) {
            System.out.println(" - " + e.getNombre());
        }
    }

    public List<Estudiante> getEstudiantes() {
        return new ArrayList<>(estudiantes);
    }

    public double calcularPromedio() {
        if (estudiantes.isEmpty()) return 0.0;
        double suma = 0.0;
        for (Estudiante e : estudiantes) {
            suma += e.getPuntaje();
        }
        return suma / estudiantes.size();
    }

    public void mostrarPromedio() {
        System.out.printf("Promedio del curso %s: %.2f%n", nombre, calcularPromedio());
    }

    public String getNombre() {
        return nombre;
    }
}

