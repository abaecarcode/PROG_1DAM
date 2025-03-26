package EjerciciosFicheros2;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.List;

public class Ejercicio6NIO {
    public static void main(String[] args) {
        Path origen = Paths.get("U5_Almacenamiento_Files_BD/EjerciciosFicheros2/ejercicio1NIO.txt");
        Path destino =  Paths.get("U5_Almacenamiento_Files_BD/EjerciciosFicheros2/Ejercicio6NIO.txt");

        try {
            Files.copy(origen, destino, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Archivo copiado correctamente");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
