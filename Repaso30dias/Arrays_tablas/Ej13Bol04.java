package Arrays_tablas;

import java.util.Scanner;

public class Ej13Bol04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] t = new int[10];
        int cont_par;  // contador de numeros pares y tabla para guardarlos
        int[] par;
        int cont_impar;
        int[] impar;

        for (int i = 0; i < 10; i++) {
            System.out.print("Introduzca un número: ");
            t[i] = sc.nextInt();
        }
        // contar la cantidad de elementos pares e impares que hay en el array
        cont_impar = 0;
        cont_par = 0;

        for (int i = 0; i < 10; i++) {
            if (esPar(t[i])) {
                cont_par++;
            } else {
                cont_impar++;
            }
        }

        // Crear las tablas par e impar del tamaño adecuado
        impar = new int[cont_impar];
        par = new int[cont_par];

        // Volvemos a procesar para copiar cada elemento en la tabla adecuada

        cont_par = 0;
        cont_impar = 0;
        for (int i = 0; i < 10; i++) {
            if (esPar(t[i])) {
                par[cont_par] = t[i];
                cont_par++;
            } else {
                impar[cont_impar] = t[i];
                cont_impar++;
            }
        }
        System.out.println("\n\nTabla par:");
        for (int i = 0; i < cont_par; i++) {
            System.out.println(par[i]);
        }

        System.out.println("\n\nTabla impar:");
        for (int i = 0; i < cont_impar; i++) {
            System.out.println(impar[i]);
        }
    }

    private static boolean esPar(int i) {
        return i % 2 == 0;
    }
}
