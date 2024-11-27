package Ejercicios.POO_1_Avanzados;

/**
 * Definición de la clase <code>Ej6v2_Tiempo</code>.
 * <p>
 * Un objeto de la clase <code>Ej6v2_Tiempo</code> se puede crear de dos
 * maneras diferentes. Se pueden indicar las horas, los minutos y los
 * segundos de la forma <code>new Ej6v2_Tiempo(3, 20, 45)</code>, o bien se
 * puede indicar únicamente la cantidad de segundos de la forma <code>
 * new Ej6v2_Tiempo(12045)</code> (ambos objetos definen el mismo intervalo
 * de tiempo).
 * <p>
 * Internamente, la clase solo almacena los segundos totales. A partir
 * de éstos, se puede deducir todo lo demás.
 *
 * @author Alejandro Torres
 */
public class Ej6_Tiempo {

    /*private int segundos;
    private int hora;
    private int minutos;*/

    private final int segundos;


    public Ej6_Tiempo(int horas, int minutos, int segundos) {
        this.segundos = (horas * 3600) + (minutos * 60) + segundos;
    }

    public Ej6_Tiempo(int s) {
        this.segundos = s;
    }

    public String toString() {
        int segundos = this.segundos;
        int horas = segundos / 3600;
        segundos -= horas * 3600;
        int minutos = segundos / 60;
        segundos -= minutos * 60;

        if (this.segundos < 0) {
            return "-(" + (-horas) + "h " + (-minutos) + "m " + (-segundos) + "s)";
        } else {
            return horas + "h " + minutos + "m " + segundos + "s";
        }
    }

    // Getter

    private int getSegundos() {
        return this.segundos;
    }

    // Metodos suma y resta

    public Ej6_Tiempo suma(Ej6_Tiempo t) {
        return new Ej6_Tiempo(this.segundos + t.getSegundos());
    }

    public Ej6_Tiempo resta(Ej6_Tiempo t) {
        return new Ej6_Tiempo(this.segundos - t.getSegundos());
    }

    /**
     * 6. Crea la clase Ej6v2_Tiempo con los métodos suma y resta. Los objetos de
     *    la clase Ej6v2_Tiempo son intervalos de tiempo y se crean de la forma
     *    Ej6v2_Tiempo t = new Ej6v2_Tiempo(1, 20, 30) donde los parámetros que se le
     *    pasan al constructor son las horas, los minutos y los segundos
     *    respectivamente. Crea el metodo toString para ver los intervalos
     *    de tiempo de la forma 10h 35m 5s. Si se suman por ejemplo 30m 40s
     *    y 35m 20s el resultado debería ser 1h 6m 0s.
     *
     *    Realiza un programa de prueba para comprobar que la clase funciona
     *    bien.
     *
     * @author Alejandro Torres
     */

    public static void main(String[] args) {
        Ej6_Tiempo t1 = new Ej6_Tiempo(1, 20, 30);
        Ej6_Tiempo t2 = new Ej6_Tiempo(0, 30, 40);
        Ej6_Tiempo t3 = new Ej6_Tiempo(0, 35, 20);

        System.out.println(t1 + " + " + t2 + " = " + t1.suma(t2));
        System.out.println(t2 + " - " + t3 + " = " + t2.resta(t3));
    }
}
