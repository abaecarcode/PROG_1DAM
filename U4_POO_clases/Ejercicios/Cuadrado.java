package Ejercicios;


/**
 * Clase Cuadrado
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
