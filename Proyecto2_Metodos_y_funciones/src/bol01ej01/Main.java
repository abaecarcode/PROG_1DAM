package bol01ej01;

/*1. Pedir los coeficientes de una ecuación se 2º grado, y muestre sus soluciones reales. Si no existen,
debe indicarlo. */

public class Main {
    public static void main(String[] args) {
        double a, b, c;
        double x1, x2, d;

        System.out.println("Introduzca el primer coeficiente (a):");
        a = Entrada.entero();
        System.out.println("Introduzca el segundo coeficiente (b):");
        b = Entrada.entero();
        System.out.println("Introduzca el tercer coeficiente (c):");
        c = Entrada.entero();

        // Calculamos el determinante
        d = ((b * b) -4*a*c);
        if (d < 0)
            System.out.println("No existen soluciones reales");
        else {
            // queda confirmar que a sea distinto de 0.
            // si a=0 nos encontramos una división por cero.
            x1=(-b + Math.sqrt(d)) / (2 * a);
            x2=(-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Solución: " + x1);
            System.out.println("Solución: " + x2);
        }
    }
}
