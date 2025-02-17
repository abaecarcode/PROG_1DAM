package Bucles;

// Programa que pida un  número por teclado y que luego muestre ese número al revés

import java.util.Scanner;

public class NumeroAlReves {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzcas un numero entero: ");
        int numero = teclado.nextInt();

        System.out.println("El numero introducido es: " + numero);

        System.out.println("Vamos a darle la vuelta.");

        String numeroCadena = String.valueOf(numero);
        numeroCadena.toString();

        //System.out.println(numeroCadena);

        StringBuilder numeroReves = new StringBuilder(numeroCadena);
        numeroReves.reverse();
        System.out.println(numeroReves);

    }
}
