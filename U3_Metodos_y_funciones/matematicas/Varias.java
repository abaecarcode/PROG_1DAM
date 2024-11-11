package matematicas;

/**
 * Funciones matemáticas de propósito general
 * @author Twi
 *
 */

public class Varias {
    /**
     *
     * @param x un numero entero positivo
     * @return <code>false</code> si el numero es primo
     *
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

}
