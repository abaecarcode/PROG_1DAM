package Bucles;

/*
Escribe una función que sume los N primeros números impares
 */

import java.util.Scanner;

public class NPrimerosImpares {

    public static int suma_n_impares(int n) {

        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += 2 * i - 1;
        }

        return(suma);
    }

    public static void main(String[] args) {

        int n;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el número de impares a sumar: ");
        n = entrada.nextInt();

        System.out.println("La suma de los " + n + " primeros impares es: " + suma_n_impares(n));
    }
}
