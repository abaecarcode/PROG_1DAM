package EjerciciosFicheros2.estoEsUnDirectorio;

import java.io.File;

public class PruebaEliminacion {
    public static void main(String[] args) {
        String rutaCarpeta = "U5_Almacenamiento_Files_BD/EjerciciosFicheros2/estoEsUnDirectorio" ;
        File carpeta = new File(rutaCarpeta);

        if (carpeta.delete()) {
            System.out.println("Carpeta eliminada con exito");
        } else {
            System.out.println("Carpeta no eliminada");
        }
    }

}
