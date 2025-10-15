package App;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Model.*;
import Interfaces.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Profesor prof = new Profesor("P01", "ROSS J.R. TIQUE MONTOYA", 29, "rjtiquem@ut.edu.co", "3000000000", "POO");
        Estudiante e1 = new Estudiante("E01", "Martin Perez", 17, "mperezhu@ut.edu", "3024392621", "085403112025");
        Estudiante e2 = new Estudiante("E02", "Mauricio  Alejandro Cardenas", 18, "mauricio@ut.edu", "3126549870", "085403152025");

        Curso curso = new Curso("Elementos POO", prof);
        curso.agregarMatricula(new Matricula(LocalDate.now(), "inscrito", 4.8));
        curso.agregarMatricula(new Matricula(LocalDate.now(), "inscrito", 3.8));

        List<IMostrable> objetos = new ArrayList<>();
        objetos.add(prof);
        objetos.add(e1);
        objetos.add(e2);
        objetos.add(curso);

        int opcion;
        do {
            System.out.println("\n=== MENÚ PRINCIPAL ===");
            System.out.println("1. Mostrar información (polimorfismo)");
            System.out.println("2. Asignar nota a estudiante");
            System.out.println("3. Mostrar promedio del curso");
            System.out.println("4. Simular matrícula con nota baja");
            System.out.println("5. Generar reporte del curso");
            System.out.println("0. Salir");
            System.out.print("Seleccione: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> {
                    for (IMostrable obj : objetos)
                        System.out.println(obj.mostrarInformacion());
                }
                case 2 -> {
                    System.out.print("Ingrese nueva nota para el estudiante 1: ");
                    double nota = sc.nextDouble();
                    sc.nextLine();
                    e1.agregarNota(new Nota(nota, "Asignada manualmente"));
                    System.out.println("Nota agregada correctamente.");
                }
                case 3 -> curso.mostrarPromedio();
                case 4 -> {
                    Matricula m = new Matricula(LocalDate.now(), "inscrito", 2.5);
                    curso.agregarMatricula(m);
                    curso.notificarPeligroDePerder();
                    curso.removerMatricula(m);
                }
                case 5 -> System.out.println(curso.generarReporte());
                case 0 -> System.out.println("Saliendo del sistema...");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 0);

        sc.close();
    }
}



