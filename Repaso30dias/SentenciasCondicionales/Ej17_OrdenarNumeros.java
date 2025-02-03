package SentenciasCondicionales;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ej17_OrdenarNumeros {
    public static void main(String[] args) {

        // Con arrays
        double a, b, c;
        Scanner entrada = new Scanner(System.in);


        ArrayList<Double> numeros = new ArrayList<>();
        for(int i = 0; i < 3; i++) {
            numeros.add(entrada.nextDouble());
        }

        System.out.println("Array numeros: " + numeros);

        System.out.print("Ingrese el primer numero: ");
        a = entrada.nextDouble();
        System.out.print("Ingrese el segundo numero: ");
        b = entrada.nextDouble();
        System.out.print("Ingrese el tercer numero: ");
        c = entrada.nextDouble();

        double[] listanum = {a,b,c};
        Arrays.sort(listanum);
        System.out.println(Arrays.toString(listanum));


        ArrayList<Double> numeros2 = new ArrayList<>();
        for (double numero : numeros2) {
            numeros2.add(numero);
        }

        System.out.println("Array numeros2: " + numeros2);
        /*ArrayList<Double> numeros = new ArrayList<>();
        for (double numero : numeros) {
            numeros.add(numero);
        }

        Collections.sort(numeros);
        System.out.println(numeros);*/

    }
}
