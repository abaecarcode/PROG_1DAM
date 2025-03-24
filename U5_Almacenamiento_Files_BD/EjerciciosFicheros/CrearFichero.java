package EjerciciosFicheros;

import java.io.File;
import java.io.IOException;

public class CrearFichero {
    public static void main(String[] args) {
        File fichero = new File("U5_Almacenamiento_Files_BD/EjerciciosFicheros/archivo99.txt");
        try {
            fichero.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
