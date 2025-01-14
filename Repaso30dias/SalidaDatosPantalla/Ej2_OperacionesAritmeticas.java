package SalidaDatosPantalla;

import java.util.Scanner;

public class Ej2_OperacionesAritmeticas {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double num1, num2;

        // Petición de los números al usuario:
        System.out.println("Introduce el primer número");
        num1 = entrada.nextDouble();

        System.out.println("Introduce el segundo número");
        num2 = entrada.nextDouble();

        //double suma;
        //suma = num1 + num2;

        double resta = num1 - num2;

        // Operaciones aritméticas
        System.out.println("Suma: " + num1+num2);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + num1*num2);
        if (num2 != 0) {
            System.out.println("División: " + num1/num2);
        } else {
            System.out.println("No se puede dividir por cero");
        }

        // Comparación entre dos números
        if(num1 > num2) {
            System.out.println(num1 + " es mayor que " + num2);
        } else if (num1 < num2) {
            System.out.println(num1 + " es menor que " + num2);
        } else {
            System.out.println(num1 + " es igual a " + num2);
        }

        // Comprobar si ambos números son positivos

        if (num1 > 0 && num2 > 0) {
            System.out.println("Los numeros son positivos");
        } else  {
            System.out.println("Al menos, un número es negativo");
        }

        entrada.close();

    }
}
