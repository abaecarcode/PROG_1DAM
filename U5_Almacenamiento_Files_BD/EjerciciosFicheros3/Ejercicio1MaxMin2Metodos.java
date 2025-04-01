package EjerciciosFicheros3;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Clase para encontrar valores máximo y mínimo en un archivo de texto.
 * En esta versión, usamos dos métodos separados para calcular máximo y mínimo.
 */
public class Ejercicio1MaxMin2Metodos {
    public static void main(String[] args) {
        try {
            String nombreArchivo = "U5_Almacenamiento_Files_BD/EjerciciosFicheros3/Documentos/numeros.txt";

            // MAXIMO
            int maximoValor = encontrarMaximo(nombreArchivo);
            System.out.println("Valor máximo: " + maximoValor);

            // MINIMO
            int minimoValor = encontrarMinimo(nombreArchivo);
            System.out.println("Valor mínimo: " + minimoValor);

        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
    /**
     * Metodo para encontrar el valor máximo en un archivo de texto.
     *
     * @param nombreArchivo Ruta del archivo a leer
     * @return El valor máximo encontrado en el archivo
     * @throws IOException Si hay un error al leer el archivo
     */
    public static int encontrarMaximo(String nombreArchivo) throws IOException {
        // Inicializamos el máximo con el valor mínimo posible. De esta manera, cualquier número será mayor.
        int maximo = Integer.MIN_VALUE;

        // Usamos try-with-resources para manejar automáticamente el cierre del archivo
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            // Leemos el archivo línea por línea
            while ((linea = br.readLine()) != null) {
                // Convertimos cada línea a entero
                int numero = Integer.parseInt(linea.trim());

                // Actualizamos el máximo si encontramos un número mayor
                if (numero > maximo) {
                    maximo = numero;
                }
            }
        }

        return maximo;
    }

    /**
     * Metodo para encontrar el valor mínimo en un archivo de texto.
     *
     * @param nombreArchivo Ruta del archivo a leer
     * @return El valor mínimo encontrado en el archivo
     * @throws IOException Si hay un error al leer el archivo
     */
    public static int encontrarMinimo(String nombreArchivo) throws IOException {
        // Inicializamos la variable que almacenará ese mínimo con un valor muy alto, de modo que cualquier número que leas del archivo lo reemplace si es menor.
        int minimo = Integer.MAX_VALUE;

        // Usamos try-with-resources para manejar automáticamente el cierre del archivo
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            // Leemos el archivo línea por línea
            while ((linea = br.readLine()) != null) {
                // Convertimos cada línea a entero
                int numero = Integer.parseInt(linea.trim());

                // Actualizamos el mínimo si encontramos un número menor
                if (numero < minimo) {
                    minimo = numero;
                }
            }
        }

        return minimo;
    }
}
