package EjerciciosFicheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerFichero {
    public static void main(String[] args) {
        try {
            FileReader archivo = new FileReader("U5_Almacenamiento_Files_BD/EjerciciosFicheros/holamundo.txt");
            BufferedReader buffer = new BufferedReader(archivo);
            String linea;
            while (true) {  // while((linea = buffer.readline()) != null)
                linea = buffer.readLine();
                if (linea == null) break;
                System.out.println(linea);
            }
            buffer.close();
        } catch (IOException e) {
            System.out.println("Error al abrir archivo: " + e.getMessage());
        }

    }
}
