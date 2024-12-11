package Ejercicios.POO_1_Intermedios.Ej17_PiramideRectangulo;


/**
 * Implementa las clases Piramide y Rectangulo. Sobre una pirámide se debe saber su altura y sobre un rectángulo se debe saber tanto la base como la altura. Cada una de las clases debe tener un atributo de clase (static) que lleve la cuenta de las pirámides y de los rectángulos creados respectivamente. El siguiente código que va dentro del main genera la salida que se indica.
 */
public class Piramide {

    private int altura;
    private static int piramidesCreadas = 0; //Contador de pirámides creadas

    // Constructor que inicializa la altura

    public Piramide(int altura) {
        this.altura = altura;
        piramidesCreadas++;
    }

    // Metodo para obtener el número de piramides creadas
    public static int getPiramidesCreadas() {
        return piramidesCreadas;
    }

    public String toString() {
        /*String cadena = "";
        int espacios = altura - 1;
        int planta = 1;
        int longitudLinea = 1;

        while(planta <= this.altura) {

            // inserta espacios
            for (int i = 1; i <= espacios; i++) {
                cadena += " ";
            }

            // linea de la piramide
            for (int i = 1; i <= longitudLinea; i++) {
                cadena += "*";
            }
            cadena += "\n";
            planta++;
            espacios--;
            longitudLinea += 2;
        }
        return cadena;
        */

        // Version StringBuilder

        StringBuilder piramide = new StringBuilder();

        for (int i = 1; i <= altura; i++) {
            // Agrego espacios
            for (int j = 1; j <= altura - i; j++) {
                piramide.append(" ");
            }
            // Agrego asteriscos:
            // Patrón de los asteriscos:
            //  primera fila: 1 asterisco, segunda fila: 3, luego 5, 7, etc.
            // Este patrón se representa matemáticamente como 2*i-1 donde:
            //      i es el número de fila actual(empezando desde 1)
            //      2*i-1 genera los números impares de manera secuencial: 1, 3, 5, 7, ...
            for (int j = 1; j <= 2 * i - 1; j++) {
                piramide.append("*");
            }
            // Agregar salto de línea:
            piramide.append("\n");

        }
        return piramide.toString();
    }

}
