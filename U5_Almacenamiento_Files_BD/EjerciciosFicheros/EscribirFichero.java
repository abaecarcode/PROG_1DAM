package EjerciciosFicheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirFichero {
    public static void main(String[] args) {
        try {
            FileWriter archivo = new FileWriter("U5_Almacenamiento_Files_BD/EjerciciosFicheros/archivo1.txt");
            BufferedWriter buffer = new BufferedWriter(archivo);

            buffer.write("Estoy escribiendo una nueva línea en el archivo.");
            buffer.newLine();
            buffer.write("Otra línea de texto.");
            buffer.newLine();
            buffer.write("Estamos espesos el lunes");
            buffer.close();
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}
