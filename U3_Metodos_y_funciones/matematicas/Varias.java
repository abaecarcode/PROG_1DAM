package matematicas;

/**
 * Funciones matemáticas de propósito general
 *
 * @author Alejandro Torres
 */

public class Varias {
    /**
     * Es primo boolean.
     *
     * @param numero un numero entero positivo
     * @return <code>false</code> si el numero es primo
     */
    public static boolean esCapicua(int numero) {
        return numero == voltea(numero);
    }

    public static boolean esPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 3. siguientePrimo
    public static int siguientePrimo(int numero) {
        do {
            numero++;
        } while (!esPrimo(numero));
        return numero;
    }

    // 4. potencia
    public static double potencia(double base, int exponente) {
        return Math.pow(base, exponente);
    }

    // 5. digitos
    public static int digitos(int numero) {
        return String.valueOf(Math.abs(numero)).length();
    }

    // 6. voltea
    public static int voltea(int numero) {
        int resultado = 0;
        while (numero != 0) {
            resultado = (resultado * 10) + (numero % 10);
            numero /= 10;
        }
        return resultado;
    }

    // 7. digitoN
    public static int digitoN(int numero, int posicion) {
        String numStr = String.valueOf(Math.abs(numero));
        return Character.getNumericValue(numStr.charAt(posicion));
    }

    // 8. posicionDeDigito
    public static int posicionDeDigito(int numero, int digito) {
        String numStr = String.valueOf(Math.abs(numero));
        return numStr.indexOf(Character.forDigit(digito, 10));
    }

    // 9. quitaPorDetras
    public static int quitaPorDetras(int numero, int n) {
        return numero / (int) potencia(10, n);
    }

    // 10. quitaPorDelante
    public static int quitaPorDelante(int numero, int n) {
        String numStr = String.valueOf(numero);
        if (n >= numStr.length()) {
            return 0;
        }
        return Integer.parseInt(numStr.substring(n));
    }

    // 11. pegaPorDetras
    public static int pegaPorDetras(int numero, int digito) {
        return numero * 10 + digito;
    }

    // 12. pegaPorDelante
    public static int pegaPorDelante(int numero, int digito) {
        String numStr = digito + String.valueOf(numero);
        return Integer.parseInt(numStr);
    }

    // 13. trozoDeNumero
    public static int trozoDeNumero(int numero, int inicio, int fin) {
        String numStr = String.valueOf(numero);
        return Integer.parseInt(numStr.substring(inicio, fin + 1));
    }

    // 14. juntaNumeros
    public static int juntaNumeros(int num1, int num2) {
        String numStr = String.valueOf(num1) + String.valueOf(num2);
        return Integer.parseInt(numStr);
    }

    public static void main(String[] args) {
        // Pruebas de las funciones
        System.out.println("Es capicúa (121): " + esCapicua(121));
        System.out.println("Es primo (13): " + esPrimo(13));
        System.out.println("Siguiente primo (14): " + siguientePrimo(14));
        System.out.println("Potencia (2^3): " + potencia(2, 3));
        System.out.println("Dígitos (12345): " + digitos(12345));
        System.out.println("Voltea (123): " + voltea(123));
        System.out.println("Dígito en posición 2 (12345): " + digitoN(12345, 2));
        System.out.println("Posición del dígito 3 (12345): " + posicionDeDigito(12345, 3));
        System.out.println("Quita por detrás (12345, 2): " + quitaPorDetras(12345, 2));
        System.out.println("Quita por delante (12345, 2): " + quitaPorDelante(12345, 2));
        System.out.println("Pega por detrás (123, 4): " + pegaPorDetras(123, 4));
        System.out.println("Pega por delante (123, 4): " + pegaPorDelante(123, 4));
        System.out.println("Trozo de número (12345, 1, 3): " + trozoDeNumero(12345, 1, 3));
        System.out.println("Junta números (123, 456): " + juntaNumeros(123, 456));
    }
}
