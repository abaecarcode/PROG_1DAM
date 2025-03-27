package EjerciciosFicheros3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio1MaxMin {
    public static void main(String[] args) throws IOException {
        String archivo = "U5_Almacenamiento_Files_BD/EjerciciosFicheros3/Ejercicio1MaxMin.java";
        // Opcion A
        //int maximo  = encontrarMaximo(archivo);
        //int minimo = encontrarMinimo(archivo);

        // Opcion B
        double[] valores = encontrarMaximoMinimo(archivo);
        System.out.println("Mínimo: " + valores[0]);
        System.out.println("Maximo: " + valores[1]);
    }

    private static double[] encontrarMaximoMinimo(String archivo) throws IOException {
        double minimo = 0;
        double maximo = 0;
        BufferedReader br = new BufferedReader(new FileReader(archivo));

        String linea;
        boolean primerNumero = true;
        while ((linea = br.readLine()) != null) {
            if (!linea.trim().isEmpty()) {
                double numero  = Double.parseDouble(linea.trim());
                if (primerNumero) {
                    minimo = numero;
                    maximo = numero;
                    primerNumero = false;
                } else {
                    minimo = Math.min(minimo, Double.parseDouble(linea));
                    maximo = Math.max(maximo, Double.parseDouble(linea));
                }
            }
        }

        return new double[] {minimo,maximo};
    }
}
