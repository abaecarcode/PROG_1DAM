package Bucles;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n;

        do {
            System.out.print("Introduce el número para calcular su factorial: ");
            n = entrada.nextInt();
            if (n < 0) {
                System.out.println("El número introducido no es correcto");
            }
        } while (n < 0);

        int factorial = 1;

        if (n == 0) {
            System.out.println("El factorial de " + n + " es igual a 1");
        } else {
            System.out.println("El factorial de " + n + " es: ");
            for (int i=1; i <= n; i++) {
                factorial *= i;
            }
            System.out.println(n + "! = " + factorial);
        }

    }
}
