package Bucles;

import java.util.Scanner;

public class Ej6Bol3_NPrimos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número que hace tope: ");
        int n = sc.nextInt();
        StringBuilder resultado = new StringBuilder();

        boolean coma = true;

        System.out.println("Los números primos entre 1 y " + n + " son: ");

        for (int i = 1; i <= n; i++) {
            if (esPrimo(i)) {
                resultado.append(i).append(", ");
                if (!coma) {
                    System.out.print(", ");
                }
                System.out.print(i);
                coma = false;
            }
        }
        System.out.println();
        resultado.deleteCharAt(resultado.length()-2);
        System.out.println(resultado);

    }
    public static boolean esPrimo(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
