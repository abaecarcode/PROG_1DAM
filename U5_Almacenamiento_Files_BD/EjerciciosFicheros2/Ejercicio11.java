package EjerciciosFicheros2;

import java.io.File;

public class Ejercicio11 {
    public static void main(String[] args) {
        File directorio = new File("U5_Almacenamiento_Files_BD/EjerciciosFicheros2");

        if (directorio.isDirectory()) {
            File[] elementos = directorio.listFiles();
            if (elementos != null) {
                for (File elemento : elementos) {
                    String tipo = "Archivo";
                    if (elemento.isDirectory()) {
                        tipo = "Directorio";
                    }
                    System.out.println(tipo + " - " + elemento.getName());
                }
            } else {
                System.out.println("La ruta especificada no es un directorio");
            }

        }
    }
}
