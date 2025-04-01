package EjerciciosFicheros2;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Ejercicio3NIO {
    public static void main(String[] args) {
        Path path = Paths.get("U5_Almacenamiento_Files_BD/EjerciciosFicheros2/ejercicio1NIO.txt");
        try {
            List<String> lineas = Files.readAllLines(path,  StandardCharsets.UTF_8);
            //Imprime cada línea del archivo por consola
            lineas.forEach(System.out::println);
            lineas.forEach(linea -> System.out.println(linea));
            /*for (String linea : lineas) {
                System.out.println(linea);
            }*/
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
