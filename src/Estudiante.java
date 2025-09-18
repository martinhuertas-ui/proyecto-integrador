import java.util.ArrayList;
import java.util.List;

public class Estudiante extends Persona {
    private double puntaje;
    private String codigoEstudiantil;
    private String estado;
    private List<Notas> notas;

    public Estudiante(String id, String nombre, int edad, String correo, String telefono,
                      double puntaje, String codigoEstudiantil, String estado) {
        super(id, nombre, edad, correo, telefono);
        this.puntaje = puntaje;
        this.codigoEstudiantil = codigoEstudiantil;
        this.estado = estado;
        this.notas = new ArrayList<>();
    }

    public double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(double puntaje) {
        this.puntaje = puntaje;
    }

    public String getCodigoEstudiantil() {
        return codigoEstudiantil;
    }

    public String obtenerEstado() {
        return estado;
    }

    public void subirTrabajos(String trabajo) {
        System.out.println(getNombre() + " subió el trabajo: " + trabajo);
    }

    public void mostrarEstudiante() {
        System.out.println(mostrarInformacion());
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() +
                String.format(" - Puntaje: %.2f - Código: %s - Estado: %s",
                        puntaje, codigoEstudiantil, estado);
    }

    public List<Notas> getNotas() {
        return new ArrayList<>(notas);
    }

    public void agregarNota(Notas n) {
        notas.add(n);
    }
}
