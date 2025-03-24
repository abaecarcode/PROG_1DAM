package EjerciciosFicheros;
/*
Programa que recibe el nombre de un archivo como argumento y muestra su contenido en la consola

 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class LectorArchivo {
    public static void main(String[] args) {

        if(args.length == 0) {
            System.out.println("Error: debe proporcionar un nombre al archivo.");
            System.out.println("Uso: java LectorArchivo <archivo1.txt>");
        }

        String nombreArchivo = args[0];
        try {
            leerArchivo(nombreArchivo);
        } catch (IOException e) {
            System.out.println("Error al leer archivo. " + e.getMessage());
        }
    }

    private static void leerArchivo(String nombreArchivo) throws IOException {
        BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo));
        String linea;
        while ((linea = lector.readLine()) != null) {
            System.out.println(linea);
        }
        lector.close();
    }
}
