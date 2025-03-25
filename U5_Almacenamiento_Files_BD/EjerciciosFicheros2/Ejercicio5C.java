package EjerciciosFicheros2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio5C {
    public static void main(String[] args) {
        try {
            FileReader archivo = new FileReader("U5_Almacenamiento_Files_BD/EjerciciosFicheros2/datos5.txt");
            BufferedReader lector = new BufferedReader(archivo);
            String linea;
            int totalPalabras = 0;
            while ((linea = lector.readLine()) != null) {
                Scanner sc = new Scanner(linea);
                while (sc.hasNextLine()) {
                    sc.next();
                    totalPalabras++;
                }
                sc.close();
            }
            lector.close();
            System.out.println("Palabras encontradas: " + totalPalabras);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo" + e.getMessage());
        }
    }
}
