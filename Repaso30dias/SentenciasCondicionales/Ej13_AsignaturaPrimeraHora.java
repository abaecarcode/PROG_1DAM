package SentenciasCondicionales;

import java.util.Scanner;

public class Ej13_AsignaturaPrimeraHora {
    public static void main(String[] args) {

        // Declaro variables
        String dia;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Ingrese el día de la semana y le diré qué asignatura toca a primera hora: ");
            dia = sc.nextLine();
            dia.toLowerCase();

            switch (dia) {
                case "lunes":
                    System.out.println("Programación 1DAM");
                    break;
                case "martes":
                    System.out.println("PSP 2DAM");
                    break;
                case "miercoles":
                    System.out.println("PMDM 2DAM");
                    break;
                case "jueves":
                    System.out.println("Sostenibilidad 1DAM");
                    break;
                case "viernes":
                    System.out.println("PSP 2DAM");
                    break;
                default:
                    System.out.println("El día introducido es incorrecto. Saliendo del programa...");
                    return;
            }
        } while (true);
    }
}
