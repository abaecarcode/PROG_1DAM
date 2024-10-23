/*2. Pedir el radio de un círculo y calcular su área. A=PI*r^2. */
package bol01ej02;

public class Main {
    public static void main(String[] args) {
        double a, r; // Área y radio
        System.out.print("Introduce el radio de un círculo: ");
        r = Entrada.real();

        a = Math.PI*Math.pow(r,2);
        //a = Math.PI*(r*r); Otra opción

        System.out.println("El área de una circunferencia de radio " + r + " es: "+ Math.round(a*100.0) / 100.0 + " metros cuadrados");
    }
}
