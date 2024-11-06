package bol01ej04;

/* 4. Pedir dos números y decir si son iguales o no.*/
public class Main {
    public static void main(String[] args) {
        int num1;
        int num2;

        System.out.println("Ingrese el primer numero");
        num1 = Entrada.entero();
        System.out.println("Ingrese el segundo numero");
        num2 = Entrada.entero();

        if (num1 == num2)
            System.out.println("Son iguales");
        else
            System.out.println("No son iguales");

    }
}
