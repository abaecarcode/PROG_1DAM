package Excepciones;

import java.util.Scanner;

public class ManejoExcepciones {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        try {
            System.out.println("Introduce el dividendo");
            int dividendo = entrada.nextInt();

            System.out.println("Introduce el divisor");
            int divisor = entrada.nextInt();

            // Posible excepción si el divisor es 0
            int res = dividendo / divisor;
            System.out.println("El resultado es : " + res);

        } catch (ArithmeticException e) {
            // Manejamos la excepción de división por cero
            System.out.println("Error: No se puede dividir por cero" + e.getMessage());
        } catch (Exception e) {
            // Manejar cualquier otra excepción
            System.out.println("Error: Se ha producido un error inesperado: " + e.getMessage());

        } finally {
            System.out.println("Fin del programa");
            entrada.close();
        }
    }

}