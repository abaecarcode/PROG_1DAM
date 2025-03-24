package EjerciciosFicheros;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivo {
    public static void main(String[] args) {
        String rutaArchivo = "U5_Almacenamiento_Files_BD/EjerciciosFicheros/archivo1.txt";
        try
         {
            FileReader fr = new FileReader(rutaArchivo);
            int caracter;
            while ((caracter = fr.read()) != -1) {
                System.out.println((char) caracter);
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " +  e.getMessage());
        }


    }
}

