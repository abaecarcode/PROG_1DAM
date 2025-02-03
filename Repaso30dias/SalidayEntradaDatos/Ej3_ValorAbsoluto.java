package SalidayEntradaDatos;

import java.util.Scanner;

public class Ej3_ValorAbsoluto {
    public static void main(String[] args) {

        // Declaro las variables al inicio (valores de entrada del algoritmo)
        double numero;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        numero = entrada.nextDouble();

        // Casos de mi problema
        if (numero < 0) {
            System.out.println("El valor absoluto del número " + numero + " es: " + numero*-1);
        } else {
            System.out.println("El valor absoluto del número " + numero + " es: " + numero);
        }

        // Puedo emplear la clase Math y usando el metodo abs()
        System.out.println("El valor absoluto del número " + numero + " es: " + Math.abs(numero));
    }
}
