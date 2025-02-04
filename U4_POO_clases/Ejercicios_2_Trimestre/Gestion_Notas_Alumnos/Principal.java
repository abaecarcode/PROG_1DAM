package Ejercicios_2_Trimestre.Gestion_Notas_Alumnos;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        GestorDeCalificaciones gestor = new GestorDeCalificaciones();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Mostrar alertas");
            System.out.println("3. Mostrar mejor estudiante");
            System.out.println("4. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\nIngrese el nombre del estudiante:");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingrese el número de materias:");
                    int numMaterias = scanner.nextInt();
                    System.out.println("Ingrese el número de evaluaciones por materia:");
                    int numEvaluaciones = scanner.nextInt();

                    Estudiante estudiante = new Estudiante(nombre, numMaterias, numEvaluaciones);

                    for (int i = 0; i < numMaterias; i++) {
                        double[] Evaluaciones = new double[numEvaluaciones];
                        System.out.println("\nIngrese las evaluaciones para la materia " + (i + 1) + ":");
                        for (int j = 0; j < numEvaluaciones; j++) {
                            Evaluaciones[j] = scanner.nextDouble();
                        }
                        estudiante.setCalificaciones(Evaluaciones);
                    }

                    gestor.agregarEstudiante(estudiante);
                    break;

                case 2:
                    System.out.println("\nMostrando alertas:");
                    for (Estudiante est : gestor.estudiantes) {
                        gestor.mostrarAlerta(est);
                    }
                    break;

                case 3:
                    Estudiante mejor = gestor.buscarMejorEstudiante();
                    if (mejor != null) {
                        System.out.println("\nEl mejor estudiante es:");
                        mejor.mostrarCalificaciones();
                        System.out.println("Promedio general: " + mejor.calcularPromedioGeneral());
                    } else {
                        System.out.println("No hay estudiantes registrados.");
                    }
                    break;

                case 4:
                    scanner.close();
                    return;

                default:
                    System.out.println("Opcion invalida. Por favor, ingrese una opcion valida.");
            }
        }
    }
}
