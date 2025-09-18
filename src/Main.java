public class Main {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("E01", "Martin Perez", 17, "mperezhu@ut.edu.co", "3024392621", 4.5, "085403112025", "Activo");
        Estudiante e2 = new Estudiante("E02", "Mauricio Cardenas", 18, "malejacar@ut.edu.co", "3209005822", 3.8, "085403232025", "Activo");

        Profesor profesor = new Profesor("P01", "Ross Tique", 33, "rjtiquem@ut.edu.co", "3004567890",
                "ELEMENTOS DE PROGRAMACIÓN ORIENTADA A OBJETOS");

        Curso curso = new Curso("ELEMENTOS DE PROGRAMACIÓN ORIENTADA A OBJETOS", profesor);

        curso.agregarEstudiante(e1);
        curso.agregarEstudiante(e2);

        e1.mostrarEstudiante();
        e2.mostrarEstudiante();
        profesor.mostrarProfesor();

        profesor.calificarEstudiante(e1, 4.8);

        curso.mostrarEstudiantes();

        curso.mostrarPromedio();
    }
}
