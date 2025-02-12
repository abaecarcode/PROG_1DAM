package EjPOO_05_Parking;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase principal que ejecuta el programa de gestión de un parking.
 * Permite la entrada y salida de coches, y muestra el estado del parking.
 *
 * @author Alejandro Torres
 */
public class PruebaParking {

    /** Instancia del parking con nombre "Centro" y 10 plazas. */
    static Parking parking = new Parking("Centro", 10);
    /** Opción seleccionada por el usuario en el menú. */
    static int opcion;
    /** Escáner para leer la entrada del usuario. */
    static Scanner scanner = new Scanner(System.in);

    /**
     * Método principal que ejecuta el programa.
     * Muestra el menú y realiza la acción seleccionada hasta que el usuario decida salir.
     *
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        do {
            menu();
            accion();
        } while (opcion != 4);
    }

    /**
     * Realiza la acción correspondiente a la opción seleccionada por el usuario.
     */
    public static void accion() {
        switch (opcion) {
            case 1 -> entradaCoche();
            case 2 -> salidaCoche();
            case 3 -> System.out.println(parking + "\n\n");
            case 4 -> System.out.println("Fin del programa\n\n");
            default -> System.out.println("Error en la opción\n\n");
        }
    }

    /**
     * Maneja la entrada de un coche en el parking.
     * Solicita la matrícula y la plaza, y gestiona posibles errores.
     */
    public static void entradaCoche() {
        boolean correcto = false;
        try {
            System.out.println("Introduzca matrícula: ");
            String m = scanner.nextLine();
            System.out.println("Introduzca la plaza: ");
            int p = Integer.parseInt(scanner.nextLine());
            parking.entrada(m, p);
            correcto = true;
        } catch (ParkingException ex) {
            // Gestiona el error específico del parking
            System.out.println("ERROR: " + ex.getMessage());
            System.out.println("No se realizó la entrada del coche con matrícula " + ex.getMatricula() + " en el parking");
        } catch (NumberFormatException ex) {
            System.out.println("Formato de número incorrecto");
        } catch (Exception ex) {
            System.out.println("ERROR DESCONOCIDO.");
        } finally {
            if (!correcto) {
                System.out.println("Se produjo un error.");
            }
        }
    }

    /**
     * Maneja la salida de un coche del parking.
     * Solicita la matrícula y muestra el estado del parking después de la salida.
     */
    public static void salidaCoche() {
        boolean correcto = false;
        try {
            System.out.println("Introduzca la matrícula: ");
            String m = scanner.nextLine();
            int p = parking.salida(m);
            System.out.println("El coche " + m + " salió de la plaza " + p + "\n\n");
            System.out.println("Plazas totales: " + parking.getPlazasTotales() + "\n");
            System.out.println("Plazas ocupadas: " + parking.getPlazasOcupadas() + "\n");
            System.out.println("Plazas libres: " + parking.getPlazasLibres() + "\n\n");
            correcto = true;
        } catch (ParkingException ex) {
            System.out.println("ERROR: " + ex.getMessage());
            System.out.println("No se realizó la salida del coche con matrícula " + ex.getMatricula() + " del parking");
        } catch (Exception ex) {
            System.out.println("ERROR DESCONOCIDO.");
        } finally {
            if (!correcto) {
                System.out.println("Se produjo un error");
            }
        }
    }

    /**
     * Muestra el menú de opciones al usuario y lee la opción seleccionada.
     */
    public static void menu() {
        System.out.println("""
                           1) Entrada de coche
                           2) Salida de coche
                           3) Mostrar parking
                           4) Salir del programa
                           ->
                           """);
        try {
            opcion = Integer.parseInt(scanner.nextLine());
        } catch (Exception ex) {
            opcion = 0;
        }
    }
}
