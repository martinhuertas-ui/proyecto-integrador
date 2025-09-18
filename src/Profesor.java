public class Profesor extends Persona implements IMostrable, ICalificable {
    private String materia;

    public Profesor(String id, String nombre, int edad, String correo, String telefono, String materia) {
        super(id, nombre, edad, correo, telefono);
        setMateria(materia);
    }

    // Getter y Setter con validación
    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        if (materia != null && !materia.trim().isEmpty()) {
            this.materia = materia.trim();
        } else {
            this.materia = "SIN-MATERIA";
        }
    }

    // Implementación de ICalificable
    @Override
    public void asignarNota(Estudiante estudiante, double nota) {
        if (estudiante != null) {
            System.out.println("El profesor " + getNombre() + " calificó a " + estudiante.getNombre() +
                    " con la nota: " + nota);

        }
    }

    // Implementación de IMostrable
    @Override
    public String mostrarInformacion() {
        return String.format("Profesor: %s | Materia: %s", super.mostrarInformacion(), materia);
    }

    @Override
    public String toString() {
        return mostrarInformacion();
    }
}
