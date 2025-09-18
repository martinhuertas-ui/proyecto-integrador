public class Profesor {
    private String id;
    private String nombre;
    private int edad;
    private String correo;
    private String telefono;
    private String materia;

    public Profesor(String id, String nombre, int edad, String correo, String telefono, String materia) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
        this.telefono = telefono;
        this.materia = materia;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void mostrarProfesor() {
        System.out.println("Profesor: " + this.nombre + " - Materia: " + this.materia);
    }

    public void calificarEstudiante(Estudiante estudiante, double nota) {
        System.out.println("El profesor " + this.nombre + " calificó a " + estudiante.getNombre() + " con nota: " + nota);
    }
}
