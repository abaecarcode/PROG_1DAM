package EjerciciosFicheros2;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Ejercicio1NIO {
    public static void main(String[] args) {
        Path path = Paths.get("U5_Almacenamiento_Files_BD/EjerciciosFicheros2/ejercicio1NIO.txt"); // Definimos la ruta del archivo
        List<String> contenido = List.of("Trabajando con el paquete java.NIO. Ficheros grandes...");

        try {
            Files.write(path, contenido, StandardCharsets.UTF_8);
            System.out.println("Archivo creado y escrito correctamente.");
            System.out.println("Nombre del archivo: " + path.getFileName());

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }


    }
}
