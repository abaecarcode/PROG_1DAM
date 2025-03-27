package EjerciciosFicheros;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

// Crear N archivo, nombre(1).txt, nombre(2).txt,.... nombre(n).txt en la carpeta que se solicita al usuario. Dentro de cada archivo debe escribirse la frase "Este es el fichero nombre(n).txt". // Utiliza un bufer para la lectura
public class NArchivos {
    public static void main(String[] args) {
        String rutaCarpeta = "U5_Almacenamiento_Files_BD/EjerciciosFicheros/" ;
        String nombreBase;
        int numArchivos;
        Scanner sc = new Scanner(System.in);

        // Solicitar al usuario la carpeta donde se crearán los archivos
        System.out.print("Ingrese la ruta de la carpeta donde se creará el archivo: ");
        rutaCarpeta += sc.nextLine();
        System.out.println("_______________________________________________________");
        // Solicitar el nombre base de los archivos
        System.out.print("Ingrese el nombre base de los archivos: ");
        nombreBase = sc.nextLine();
        System.out.println("_______________________________________________________");
        // Solicitar los archivos a crear
        System.out.print("Ingrese el numero de archivos a crear: ");
        numArchivos = sc.nextInt();
        System.out.println("_______________________________________________________");

        // Crear los archivos
        crearArchivosMultiples(rutaCarpeta, nombreBase, numArchivos);
        sc.close();
    }
    public static void crearArchivosMultiples(String rutaCarpeta, String nombreBase, int numArchivos) {
        // Crear carpeta si no existe
        File carpeta = new File(rutaCarpeta);
        if (!carpeta.exists()) {
            carpeta.mkdirs();
        }

        // Crear archivos
        for (int i = 1; i <= numArchivos; i++) {
            String nombreArchivo = nombreBase + "(" + i + ").txt";
            File archivo = new File(carpeta, nombreArchivo);

            try {
                PrintWriter escribir = new PrintWriter(archivo);
                escribir.println("Este es el fichero " + nombreArchivo);
                System.out.println("Archivo creado correctamente: " + archivo.getAbsolutePath());
                escribir.close();
            } catch (IOException e) {
                System.out.println("Error al crear el archivo " + nombreArchivo);
            }

        }


    }
}
