package bol01ej14;

import java.util.Scanner;

public class Ej14IfElse {
    public static void main(String[] args) {
        // Instancio objeto sc y creo variable nota
        double nota;
        Scanner sc = new Scanner(System.in);

        // Pido la nota por pantalla
        System.out.print("Introduzca una nota: ");
        nota = sc.nextDouble();

        if (nota >= 0 && nota < 5) {
            System.out.println("INSUFICIENTE");
        } else if (nota >= 5 && nota < 6) {
            System.out.println("SUFICIENTE");
        } else if (nota >= 6 && nota < 7) {
            System.out.println("BIEN");
        } else if (nota >= 7 && nota < 9) {
            System.out.println("NOTABLE");
        } else if (nota >= 9 && nota < 10) {
            System.out.println("SOBRESALIENTE");
        } else if (nota == 10) {
            System.out.println("MATRICULA DE HONOR");
        } else {
            System.out.println("Nota fuera de rango.");
        }
    }
}