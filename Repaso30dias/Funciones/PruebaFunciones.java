package Funciones;

import java.util.Scanner;

import static Funciones.FuncionesVarias.digitos;

public class PruebaFunciones {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        long numero = sc.nextLong();

        int cantidadDigitos;
        cantidadDigitos = digitos(numero);

        System.out.println("Los digitos del número introducido por el usuario son: " +  cantidadDigitos);
    }
}
