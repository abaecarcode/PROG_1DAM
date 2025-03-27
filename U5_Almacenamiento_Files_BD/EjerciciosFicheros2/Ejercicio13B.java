package EjerciciosFicheros2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ejercicio13B {
    public static void main(String[] args) {
        copiarConTransferTo("U5_Almacenamiento_Files_BD/EjerciciosFicheros2/imagen_original.jpg", "U5_Almacenamiento_Files_BD/EjerciciosFicheros2/imagen_copia.jpg");
    }

    private static void copiarArchivoBinario(String archivoOrigen, String archivoDestino) {
        try {
            // Creamos flujos de entrada y salida
            FileInputStream entrada = new FileInputStream(archivoOrigen);
            FileOutputStream salida = new FileOutputStream(archivoDestino);

            // Buffer para leer y escribir bloques de datos
            byte[] buffer = new byte[4096];
            int bytesLeidos;
            // Leemos y escribimos bloques de datos
            while ((bytesLeidos = entrada.read(buffer)) != -1) {
                salida.write(buffer, 0, bytesLeidos);
            }

            System.out.println("Archivo binario copiado exitosamente de " + archivoOrigen + " a " + archivoDestino);

            entrada.close();
            salida.close();
        } catch (IOException e){
            System.out.println("Error al copiar: " + e.getMessage());
        }
    }
    public static void copiarConTransferTo(String archivoOrigen, String archivoDestino) {
        // Creamos flujos de entrada y salida
        try {
            FileInputStream entrada = new FileInputStream(archivoOrigen);
            FileOutputStream salida = new FileOutputStream(archivoDestino);

            long bytesCopiados = entrada.transferTo(salida);

            System.out.println("Archivo copiado correctamente de " + archivoOrigen + " a " + archivoDestino + " con bytes: " + bytesCopiados);
        } catch (IOException e) {
            System.out.println("Error al copiar: " + e.getMessage());
        }

    }
}
