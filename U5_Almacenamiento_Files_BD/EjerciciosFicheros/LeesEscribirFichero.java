package EjerciciosFicheros;

import java.io.*;

public class LeesEscribirFichero {
    public static void main(String[] args) {
        try {
            BufferedReader entrada = new BufferedReader(new FileReader("U5_Almacenamiento_Files_BD/EjerciciosFicheros/entrada.txt"));
            BufferedWriter salida = new BufferedWriter(new FileWriter("U5_Almacenamiento_Files_BD/EjerciciosFicheros/salida.txt"));

            String linea;
            int contador = 0;
            while ((linea = entrada.readLine()) != null) {
                salida.write(linea.toUpperCase());
                contador++;
                //salida.newLine();
            }
            salida.close();
            System.out.println("Las líneas o filas que tiene el documento son: " + contador);

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());;
        }
    }
}
