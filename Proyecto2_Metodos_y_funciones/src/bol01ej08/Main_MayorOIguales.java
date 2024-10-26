package bol01ej08;

public class Main_MayorOIguales {
    public static void main(String[] args) {
        int n1,n2;
        System.out.print("Introduce un número: ");
        n1 = Entrada.entero();
        System.out.print("Introduce otro número: ");
        n2 = Entrada.entero();
        if(n1 == n2)
            System.out.println("Son iguales");
        else {
            if(n1 > n2)
                System.out.println(n1 + " es mayor que " + n2);
            else
                System.out.println(n2 + " es mayor que " + n1);
        }
    }
}
