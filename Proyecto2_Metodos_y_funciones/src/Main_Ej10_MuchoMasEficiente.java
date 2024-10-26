import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main_Ej10_MuchoMasEficiente {
    public static void main(String[] args) {
        Integer[] numeros = new Integer[3];
        //Scanner sc = new Scanner(System.in);

        // Pedir los tres números
        System.out.print("Introduzca primer número: ");
        //numeros[0] = sc.nextInt();
        numeros[0] = Entrada.entero();
        System.out.print("Introduzca segundo número: ");
        //numeros[1] = sc.nextInt();
        numeros[1] = Entrada.entero();
        System.out.print("Introduzca tercer número: ");
        //numeros[2] = sc.nextInt();
        numeros[2] = Entrada.entero();

        // Ordenar el array en orden descendente
        Arrays.sort(numeros, Collections.reverseOrder());

        // Mostrar los números ordenados
        System.out.println("Números ordenados de mayor a menor: " + numeros[0] + ", " + numeros[1] + ", " + numeros[2]);
    }
}
