public class TablaBidimensional_v2 {
    public static void main(String[] args) {
        int filas = 4;
        int columnas = 5;
        int[][] tabla = new int[filas][columnas];

        // Rellenar la tabla con números consecutivos, por ejemplo
        int contador = 1;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                tabla[i][j] = contador++;
            }
        }

        // Imprimir la tabla con bordes
        System.out.println("+----+----+----+----+----+"); // Línea superior
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.printf("| %2d ", tabla[i][j]); // Imprime el valor en formato de celda
            }
            System.out.println("|"); // Cierra la fila con borde derecho
            System.out.println("+----+----+----+----+----+"); // Línea entre filas
        }
    }
}
