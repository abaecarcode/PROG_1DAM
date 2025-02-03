package SentenciasCondicionales;

import java.util.Scanner;

public class Ej15_Ecuacion {
    public static void main(String[] args) {

        double prueba = -1;
        System.out.println(prueba*-1);
        double x1, x2;
        double a, b, c;
        Scanner sc = new Scanner(System.in);
        double discriminante;

        System.out.println("Resuelve la ecuación");
        System.out.println("ax² + bx + c = 0");

        System.out.println("Introduce los valores.");

        System.out.print("a = ");
        a = sc.nextDouble();

        System.out.print("b = ");
        b = sc.nextDouble();

        System.out.print("c = ");
        c = sc.nextDouble();

        // Todos los coeficientes son 0
        if (a == 0 && b == 0 && c == 0) {
            System.out.println("La ecuación tiene infinitas soluciones");
        }

        // Si a y b son 0 y c distinto de 0
        if (a == 0 && b == 0 && c != 0) {
            System.out.println("La ecuación no tiene solución");
        }

        // Si a y b son distinto de 0 y c es igul a 0
        if (a != 0 && b != 0 && c == 0) {
            System.out.println("x1 = 0");
            System.out.println("x2 = " + (-b / a));
        }

        // Si a y b son distinto de 0 y c es igul a 0
        if (a == 0 && b != 0 && c != 0) {
            System.out.println("x1 = x2 = " + (-c / b));
        }

        // Si a, b y c son distintos de 0
        if (a != 0 && b != 0 && c != 0) {

             discriminante = b*b - 4*a*c;
             if (discriminante < 0) {
                 System.out.println("La ecuación no tiene soluciones reales");
             } else {
                 System.out.println("x1 = " + (-b + (Math.sqrt(discriminante))/2*a));
                 System.out.println("x1 = " + (-b - (Math.sqrt(discriminante))/2*a));
             }
        }


    }
}