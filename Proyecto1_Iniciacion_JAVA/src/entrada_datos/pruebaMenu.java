package entrada_datos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pruebaMenu {
    public void mostrarMenu() {
        System.out.println("___Bienvenido al menú de opciones_____");
        System.out.println("1. ");
        System.out.println("2. ");
        System.out.println("3. ");
        System.out.println("0 u otra cosa. Salir ");
    }
    public int leerOpcion() {

        // Recogemos una opción por parte del usuario
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int opcion = 0;
        System.out.println("Ingrese una opcion: ");
        try {
            opcion = Integer.parseInt(entrada.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return opcion;
    }

    public void ejecutarMenu() {
        int opcion = leerOpcion();
        while (true) {
            switch (opcion) {
                case 1:
                    System.out.println("Se ejecuta la función deseada");
                case 2:
                    System.out.println("Se ejecuta el segundo caso. Otra función deseada");
                case 3:
                    System.out.println("Se ejecuta el tercer caso.");
                default:
                    System.out.println("Saliendo del programa...");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        pruebaMenu pruebaMenu = new pruebaMenu();
        pruebaMenu.mostrarMenu();
        pruebaMenu.ejecutarMenu();
    }
}
