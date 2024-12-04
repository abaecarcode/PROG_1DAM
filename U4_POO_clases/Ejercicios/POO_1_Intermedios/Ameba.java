package Ejercicios.POO_1_Intermedios;

<<<<<<< HEAD
class Ameba {
    int peso; // peso en microgramos

    public Ameba() {
        this.peso = 3;
    }

    void come(int pesoComida) {
        this.peso += pesoComida - 1;
    }

    void come(Ameba a) {
        this.peso += a.peso - 1;
        a.peso = 0; // la ameba comida se queda sin sustancia
    }

    @Override
    public String toString() {
        return "Soy una ameba y peso " + peso + " microgramos.";
    }

}
=======

/**
 * Análisis del problema:
 *  1. Peso inicial: Cada ameba comienza con un peso de 3 microgramos.
 *  2. Comportamiento al comer:
 *      a. Si come una cantidad de peso entero, incrementa su peso en pesoComida-1 (
 *          gasta 1 microgramo en fagocitar)
 *      b. Si come otra ameba:
 *          - Incrementamos su peso en pesoDeLaOtraAmeba
 *          - La ameba comida queda con un peso de 0 microgramos
 *  3. Metodo sobrecargado come: Uno recibe un entero y otro una isntancia
 *  4. Representación en texto: toString, que devuelve una descripción
 */
public class Ameba {

    private String nombre;
    private int peso; // peso en microgramos

    public Ameba(String nombre) {
        this.nombre = nombre;
        this.peso = 3;
    }

    public void come(int pesoComida) {
        this.peso += pesoComida - 1;
    }

    public void come(Ameba ameba) {
        this.peso += ameba.peso - 1;
        ameba.peso = 0;
    }

    public String toString() {
        return "Soy una ameba llamada " + nombre + " y peso " + peso + " microgramos.";

    }
}
>>>>>>> 104b1d55dd8d858875430979becdda81b74fe333
