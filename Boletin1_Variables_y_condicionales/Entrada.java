/*Estas tres líneas importan las clases necesarias para manejar la entrada de datos por teclado.*/
import java.io.BufferedReader; // BufferedReader mejora la eficiencia de la lectura de caracteres, almacenando los datos en un - buffer
import java.io.IOException; // IOException se utiliza para manejar posibles errores de entrada/salida
import java.io.InputStreamReader; // InputStreamReader convierte la entrada de bytes (que viene del teclado) en caracteres

/* CLASE Entrada. Que contiene métodos que permiten capturar diferentes tipos de datos del usuario */

public class Entrada {
    static String inicializar() {
        String buzon = "";
        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(flujo);

        try {
            buzon = teclado.readLine();
        } catch (IOException e) {
            System.out.append("Entrada incorrecta");
        }
        return buzon;
    }

    static int entero() {
        int valor = Integer.parseInt(inicializar());
        return valor;
    }

    static double real() {
        double valor = Double.parseDouble(inicializar());
        return valor;
    }
    static String cadena() {
        String valor = inicializar();
        return valor;
    }
    static char caracter() {
        String valor = inicializar();
        return valor.charAt(0);
    }
}
