package bol01ej06;

public class Main_MultiploDeOtro {
    public static void main(String[] args) {
        int n1, n2;
        // Leo un número a partir del uso de la Clase Entrada y del metodo entero()
        System.out.print("Introduce un número: ");
        n1 = Entrada.entero();

        //Leo el otro número
        System.out.print("Introduce otro número: ");
        n2 = Entrada.entero();

        if( n1 % n2 == 0 )
            System.out.println("Son múltiplos");
        else
            System.out.println("No son múltiplos");
    }
}
