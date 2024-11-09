public class TablaBidimensional {
    public static void main(String[] args) {
        int filas = 4;
        int columnas = 5;
        int[][] tabla = new int[filas][columnas];

        // Rellenamos la tabla con números consecutivos, por ejemplo
        int contador = 1;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                tabla[i][j] = contador++;
            }
        }

        // Imprimimos la tabla
        System.out.println("Tabla bidimensional 4x5:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(tabla[i][j] + "\t"); // "\t" agrega un tabulador para una mejor visualización
            }
            System.out.println(); // Salto de línea al final de cada fila
        }
    }
}
