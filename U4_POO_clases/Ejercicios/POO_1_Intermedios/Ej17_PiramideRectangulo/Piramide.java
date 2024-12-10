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
}
