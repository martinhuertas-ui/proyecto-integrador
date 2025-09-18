public class Persona {
    private String id;
    private String nombre;
    private int edad;
    private String correo;
    private String telefono;

    public Persona(String id, String nombre, int edad, String correo, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
        this.telefono = telefono;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public String getCorreo() { return correo; }
    public String getTelefono() { return telefono; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setEdad(int edad) { this.edad = edad; }
    public void setCorreo(String correo) { this.correo = correo; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String mostrarInformacion() {
        return String.format("ID:%s - Nombre:%s - Edad:%d - Correo:%s - Teléfono:%s",
                id, nombre, edad, correo, telefono);
    }
}