package Ejercicios;
/**
 *
 *
 *  Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y que los
 *     almacene en un array. El programa debe ser capaz de pasar todos los números pares a
 *     las primeras posiciones del array (del 0 en adelante) y todos los números impares a
 *     las celdas restantes. Utiliza arrays auxiliares si es necesario.
 *
 */
public class Arrays_Aleatorios_v2 {

    public static void main(String[] args) {

        int[] original = new int[20];
        int[] par = new int[20];
        int[] impar = new int[20];
        int i;
        int pares = 0;
        int impares = 0;

        for (i = 0; i < 20; i++) {
            original[i] = (int)(Math.random() * 101);
            // Separa los números metiendo los pares en un array
            // y los impares en otro.
            if (original[i] % 2 == 0) {
                par[pares++] = original[i];
            } else {
                impar[impares++] = original[i];
            }
        }

        // Muestra el array original
        System.out.println("Array original:");
        for (i = 0; i < 20; i++) {
            System.out.print(original[i] + " ");
        }
        System.out.println();

        // Mete los pares en las primeras posiciones
        // del array original.
        for (i = 0; i < pares; i++) {
            original[i] = par[i];
        }

        // Mete los impares en los huecos que quedan.
        for (i = pares; i < 20; i++) {
            original[i] = impar[i - pares];
        }

        // Muestra el resultado.
        System.out.println("Array con los pares al principio e impares al final:");
        for (i = 0; i < 20; i++) {
            System.out.print(original[i] + " ");
        }
    }
}
