package bol01ej21;

import java.util.Scanner;

public class ej21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Introduzca una nota numérica entre 0 y 10: ");
        num = sc.nextInt();

        switch (num) {
            case 0 -> System.out.println("CERO");
            case 1 -> System.out.println("UNO");
            case 2 -> System.out.println("DOS");
            case 3 -> System.out.println("TRES");
            case 4 -> System.out.println("CUATRO");
            case 5 -> System.out.println("CINCO");
            case 6 -> System.out.println("SEIS");
            case 7 -> System.out.println("SIETE");
            case 8 -> System.out.println("OCHO");
            case 9 -> System.out.println("NUEVE");
            case 10 -> System.out.println("DIEZ");
            default -> System.out.println("Nota fuera de rango");
        }
    }
}
