public class Persona implements IMostrable {
    private String id;
    private String nombre;
    private int edad;
    private String correo;
    private String telefono;

    public Persona(String id, String nombre, int edad, String correo, String telefono) {
        setId(id);
        setNombre(nombre);
        setEdad(edad);
        setCorreo(correo);
        setTelefono(telefono);
    }

    // Getters y Setters con validación
    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id != null && !id.trim().isEmpty()) {
            this.id = id.trim();
        } else {
            this.id = "SIN-ID";
        }
    }

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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0 && edad <= 120) {
            this.edad = edad;
        } else {
            this.edad = 0;
        }
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        if (correo != null && correo.contains("@")) {
            this.correo = correo.trim();
        } else {
            this.correo = "correo_invalido@ut.edu";
        }
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if (telefono != null && telefono.matches("\\d{7,10}")) {
            this.telefono = telefono;
        } else {
            this.telefono = "0000000000";
        }
    }

    // Implementación de IMostrable
    @Override
    public String mostrarInformacion() {
        return String.format("ID:%s - Nombre:%s - Edad:%d - Correo:%s - Teléfono:%s",
                id, nombre, edad, correo, telefono);
    }

    @Override
    public String toString() {
        return mostrarInformacion();
    }
}
