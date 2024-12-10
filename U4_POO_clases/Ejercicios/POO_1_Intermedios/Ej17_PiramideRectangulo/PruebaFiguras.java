package Ejercicios.POO_1_Intermedios.Ej17_PiramideRectangulo;

/**
 *
 *  Implementa las clases Piramide y Rectangulo. Sobre una pirámide se debe saber su altura y sobre un rectángulo se debe saber tanto la base como la altura. Cada una de las clases debe tener un atributo de clase (static) que lleve la cuenta de las pirámides y de los rectángulos creados respectivamente. El siguiente código que va dentro del main genera la salida que se indica.
 *
 */
public class PruebaFiguras {
    public static void main(String[] args) {
        Piramide piramide = new Piramide(4);
        Piramide piramide2 = new Piramide(4);
        Piramide piramide3 = new Piramide(4);

        System.out.println("Piramides creadas hasta el momento: " + Piramide.getPiramidesCreadas());




    }


}
