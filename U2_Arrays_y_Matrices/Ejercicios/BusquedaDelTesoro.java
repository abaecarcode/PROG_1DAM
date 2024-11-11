package Ejercicios;

import java.util.Scanner;

public class BusquedaDelTesoro {
    public static void main(String[] args) {

        final int VACIO = 0;
        final int MINA = 1;
        final int TESORO = 2;
        final int INTENTO = 3;

        int x, y;
        int[][] cuadrante = new int[5][4];
        Scanner entrada = new Scanner(System.in);

        // Inicializa el array
        for (x = 0; x < 5; x++) {
            for (y = 0; y < 4; y++) {
                cuadrante[x][y] = VACIO;
            }
        }

        // Coloca la mina
        int minaX = (int) (Math.random() * 5);
        int minaY = (int) (Math.random() * 4);
        cuadrante[minaX][minaY] = MINA;

        // Coloca el tesoro
        int tesoroX, tesoroY;

        do {    //  ejecuta el bloque de código al menos una vez y luego evalúa la condición para decidir si debe repetir el bucle
            tesoroX = (int) (Math.random() * 5);
            tesoroY = (int) (Math.random() * 4);
        } while ((minaX == tesoroX) && (minaY == tesoroY)); // Si el tesoroX y tesoroY generados no coinciden con minaX y minaY, el bucle se detiene.
        cuadrante[tesoroX][tesoroY] = TESORO;

        System.out.println("¡BUSCA EL TESORO!");
        boolean salir = false;
        String c;

        do {
            // Pinta el cuadrante con bordes y encabezado de columnas
            System.out.println("   ┼───┼───┼───┼───┼───┼");
            for (y = 3; y >= 0; y--) {
                System.out.print(" " + y + " │"); // Etiqueta de fila
                for (x = 0; x < 5; x++) {
                    // Solo muestra "X" donde se ha intentado o espacios en otros casos
                    if (cuadrante[x][y] == INTENTO) {
                        System.out.print(" X │");
                    } else {
                        System.out.print("   │");
                    }
                }
                System.out.println("\n   ┼───┼───┼───┼───┼───┼"); // Línea de separación entre filas
            }
            System.out.println("     0   1   2   3   4  "); // Etiquetas de columna

            // Pide las coordenadas
            System.out.print("Coordenada x: ");
            x = entrada.nextInt();
            System.out.print("Coordenada y: ");
            y = entrada.nextInt();

            // Validación de límites
            if (x < 0 || x > 4 || y < 0 || y > 3) {
                System.out.println("Coordenadas fuera de los límites. Inténtalo de nuevo.");
                continue;
            }

            // Verifica el contenido en las coordenadas dadas
            switch (cuadrante[x][y]) {
                case VACIO:
                    cuadrante[x][y] = INTENTO;
                    break;
                case MINA:
                    System.out.println("Lo siento, has perdido.");
                    salir = true;
                    break;
                case TESORO:
                    System.out.println("¡Enhorabuena! ¡Has encontrado el tesoro!");
                    salir = true;
                    break;
                default:
            }
        } while (!salir);

        // Muestra el cuadrante final con contenido revelado
        System.out.println("\nEstado final del tablero:");
        System.out.println("   ┼───┼───┼───┼───┼───┼");
        for (y = 3; y >= 0; y--) {
            System.out.print(" " + y + " │");
            for (x = 0; x < 5; x++) {
                switch (cuadrante[x][y]) {
                    case VACIO:
                        c = "   ";
                        break;
                    case MINA:
                        c = " * ";
                        break;
                    case TESORO:
                        c = " € ";
                        break;
                    case INTENTO:
                        c = " X ";
                        break;
                    default:
                        c = "   ";
                }
                System.out.print(c + "│");
            }
            System.out.println("\n   ┼───┼───┼───┼───┼───┼");
        }
        System.out.println("     0   1   2   3   4  ");
    }
}
