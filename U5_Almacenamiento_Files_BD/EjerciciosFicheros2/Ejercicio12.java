package EjerciciosFicheros2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio12 {
    public static void main(String[] args) {
        try {
            BufferedReader lector = new BufferedReader(new FileReader("U5_Almacenamiento_Files_BD/EjerciciosFicheros2/datos.csv"));
            String linea;
            System.out.println("Contenido del CSV:\n");
            // Leemos línea a línea hasta el final del archivo.
            while ((linea = lector.readLine()) != null) {
                // Dividimo la línea por comas
                String[] datos = linea.split(",");
                // Imprimimos los datos formateados
                for(String dato: datos) {
                    if (!dato.isEmpty()) {
                        // formateo de la salida por columnas y eliminación de espacios en blanco
                        //System.out.println(dato);
                        System.out.printf("%-15s", dato.trim());
                    }
                }
                //Salto de línea
                System.out.println();
            }
        } catch (IOException e) {
            System.out.println("Error al leer archivo CSV: " + e.getMessage());
        }
    }
}
