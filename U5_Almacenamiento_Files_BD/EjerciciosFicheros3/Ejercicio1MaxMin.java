package EjerciciosFicheros3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio1MaxMin {
    public static void main(String[] args) {
        String archivo = "U5_Almacenamiento_Files_BD/EjerciciosFicheros3/Documentos/numeros.txt";
        // Opcion A
        //int maximo  = encontrarMaximo(archivo);
        //int minimo = encontrarMinimo(archivo);

        // Opcion B
        try {
            double[] valores = encontrarMaximoMinimo(archivo);
            if (valores == null) {
                System.out.println("El archivo está vacío");
            } else {
                System.out.println("Mínimo: " + valores[0]);
                System.out.println("Maximo: " + valores[1]);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }
    }

    private static double[] encontrarMaximoMinimo(String archivo) throws IOException {
        double minimo = Double.MAX_VALUE;
        double maximo = Double.MIN_VALUE;
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
        if (primerNumero) {
            return null;
        } else {
            return new double[] {minimo,maximo};
        }
        /*return primerNumero ? null : new double[]{minimo, maximo};
         Expresión condicional ternaria. Si la condición es true, se devuelve null, si es false, se devuelve un array con los valores minimo y maximo.
         */
    }
}
