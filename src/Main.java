import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Profesor prof = new Profesor("P01", "ROSS J.R. TIQUE MONTOYA", 30, "rjtiquem@ut.edu.co", "3000000000", "POO");

        Estudiante est1 = new Estudiante("E01", "Martin Perez Huertas", 17, "mperezhu@ut.edu.co", "3024392621", "085403112025");
        Estudiante est2 = new Estudiante("E02", "Mauricio Alejandro Cardenas", 18, "malejcar@ut.edu.co", "3209005822", "085403232025");

        Curso curso = new Curso("Elementos POO", prof);

        Matricula m1 = new Matricula(LocalDate.now(), "inscrito", 4.8);
        Matricula m2 = new Matricula(LocalDate.now(), "inscrito", 2.9);

        curso.agregarMatricula(m1);
        curso.agregarMatricula(m2);

        Nota nota1 = new Nota(4.8, "examen parcial");
        Nota nota2 = new Nota(3.2, "examen parcial");

        est1.agregarNota(nota1);
        est2.agregarNota(nota2);

        List<IMostrable> lista = new ArrayList<>();
        lista.add(curso);
        lista.add(est1);
        lista.add(est2);

        System.out.println("---- Informes ----");
        for (IMostrable i : lista) {
            System.out.println(i.mostrarInformacion());
        }

        System.out.println();
        curso.mostrarPromedio();

        curso.notificarPeligroDePerder();
    }
}
