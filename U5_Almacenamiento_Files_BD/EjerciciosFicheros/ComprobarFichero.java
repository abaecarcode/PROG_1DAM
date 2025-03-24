package EjerciciosFicheros;

import java.io.File;

public class ComprobarFichero {
    public static void main(String[] args) {
        File fichero = new File("U5_Almacenamiento_Files_BD/EjerciciosFicheros/archivo1.txt");
        if (fichero.exists()) {
            System.out.println("El fichero existe");

            System.out.println("Nombre del fichero: " + fichero.getName());
            System.out.println("Ruta absoluta: " + fichero.getAbsolutePath());
            System.out.println("Tamaño del fichero: " + fichero.length() +  " bytes");

        }  else {
            System.out.println("El fichero no existe");
        }

    }
}
