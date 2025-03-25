package EjerciciosFicheros2;


import java.io.File;
import java.io.IOException;

// Renombrar un archivo
public class Ejercicio9 {
    public static void main(String[] args) {
        try {
            // Creamos objetos File para ficheros antiguo y nuevo
            File archivoOriginal = new File("U5_Almacenamiento_Files_BD/EjerciciosFicheros2/info9.txt");
            File archivoNuevo = new File("U5_Almacenamiento_Files_BD/EjerciciosFicheros2/datos9.txt");

            if (archivoOriginal.renameTo(archivoNuevo)) {
                System.out.println("Archivo renombrado exitosamente de:  " + archivoOriginal.getName() + " a "  + archivoNuevo.getName());
            } else {
                System.out.println("Archivo no renombrado");
            }

        } catch (SecurityException e) {
            System.out.println("Error al cargar archivo" +  e.getMessage());
        }
    }
}
