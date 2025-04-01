package EjerciciosFicheros2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Ejercicio5B {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("U5_Almacenamiento_Files_BD/EjerciciosFicheros2/datos5.txt");
            BufferedReader lector = new BufferedReader(fr);
            String linea;
            int totalPalabras = 0;
            while ((linea = lector.readLine()) != null) {
                StringTokenizer tokenizer = new StringTokenizer(linea);
                totalPalabras += tokenizer.countTokens();
            }
            lector.close();
            System.out.println("El archivo contiene " + totalPalabras + " palabras");

        } catch (IOException e) {
            System.out.println("Error al leer el archivo" +  e.getMessage());
        }
    }
}
