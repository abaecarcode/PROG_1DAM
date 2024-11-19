package matematicas;

import java.util.ArrayList;

/**
 * Funciones matemáticas de propósito general
 *
 * @author Alejandro Torres
 */
public class Varias {
    /**
     * Es primo boolean.
     *
     * @param x un numero entero positivo
     * @return <code>false</code> si el numero es primo
     */
    public static boolean esPrimo(int x) {
        if (x < 2) {
            return false;
        }
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Devuelve verdadero si el número que se pasa como parámetro es capicúa y falso en caso contrario
     *
     * El num cap es aquel que se lee igual de izq a der
     * */

    /*public static boolean esCapicua(int x) {
        return esCapicua();
    }*/

    /*public static int siguientePrimo(int x) {

        while(!esPrimo(++x)) {
        }
        return x;
    }

    public static double potencia(int base, int exp) {
        return Math.pow(base, exp);
    }

    public static int digitos(long x) {

        if (x < 0) {
            x = -x;
        }
        if (x == 0) {
            return 1;
        } else {
            int n = 0;
            while (x > 0) {
                x = x / 10;
                n++;
            }
            return n;
        }

        public static long voltea(long x) {
            if (x < 0) {

            }
            ArrayList<Integer> digitos = new ArrayList<>();
            while (x > 0) {
                digitos.add((int) (x % 10)); // añado el último digito al array
                x = x / 10; // reduzco el numero
            }
            long volteado = 0;
            for (int i = 0; i < digitos.size(); i++) {
                volteado =(volteado * 10) + digitos.get(i);
            }

        }

        public static int digitoN(long x, int n) {
            x = voltea(x);
        }

    }
    public static void main(String[] args) {
    }
*/
}
