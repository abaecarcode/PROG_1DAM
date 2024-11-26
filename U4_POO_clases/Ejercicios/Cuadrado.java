package Ejercicios;

/**
 * Clase Cuadrado. Explicación del metodo toString().
 *
 * En Java existe una solución muy elegante para mostrar información sobre un objeto
 * por pantalla. Si se quiere mostrar el contenido de la variable entera x se utiliza
 * System.out.print(x) y si se quiere mostrar el valor de la variable de tipo cadena de
 * caracteres nombre se escribe System.out.print(nombre). De la misma manera, si se quiere
 * mostrar el objeto miPiramide que pertenece a la clase Piramide, también se podría usar
 * System.out.print(miPiramide). Java sabe perfectamente cómo mostrar números y cadenas
 * de caracteres pero no sabe a priori cómo se pintan pirámides. Para indicar a Java cómo
 * debe pintar un objeto de la clase Piramide basta con implementar el metodo toString
 * dentro de la clase.
 *
 * @autor Alejandro Torres
 */
public class Cuadrado {

    // Atributos
    private int lado;

    // Metodos
    public Cuadrado(int lado) {
        this.lado = lado;
    }
    public int getLado() {
        return lado;
    }


    // ¿Qué pasa si quiero pintar información de un objeto por pantalla?

    public String toString() {
        int i, espacios;    // Variables de iteracion por filas y columnas
        String resultado = "";  // Variable de tipo texto que acumula la representacion visual del cuadrado

        // Bucle que acumula lado asteriscos y un salto de linea
        for (i = 0; i < this.lado; i++) {
            resultado += "* ";
        }
        resultado += "\n";

        for (i = 1; i < this.lado-1; i++) {
            resultado += "* ";
            for (espacios = 1; espacios < this.lado-1; espacios++) {
                resultado += "  ";
            }
            resultado += "*\n";
        }
        for (i = 0; i < this.lado; i++) {
            resultado += "* ";
        }
        resultado += "\n";


        return resultado;
    }

    public static void main(String[] args) {
        Cuadrado c = new Cuadrado(10);
        System.out.println(c);
    }
}
