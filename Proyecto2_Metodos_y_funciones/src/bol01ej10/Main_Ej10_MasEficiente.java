package bol01ej10;

import java.util.Scanner;

public class Main_Ej10_MasEficiente {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);

        // Pedir los tres números
        System.out.print("Introduzca primer número: ");
        a = sc.nextInt();
        System.out.print("Introduzca segundo número: ");
        b = sc.nextInt();
        System.out.print("Introduzca tercer número: ");
        c = sc.nextInt();

        // Comparaciones para mostrar los números en orden de mayor a menor
        if (a >= b && b >= c) {
            System.out.println(a + ", " + b + ", " + c);
        } else if (a >= c && c >= b) {
            System.out.println(a + ", " + c + ", " + b);
        } else if (b >= a && a >= c) {
            System.out.println(b + ", " + a + ", " + c);
        } else if (b >= c && c >= a) {
            System.out.println(b + ", " + c + ", " + a);
        } else if (c >= a && a >= b) {
            System.out.println(c + ", " + a + ", " + b);
        } else {
            System.out.println(c + ", " + b + ", " + a);
        }
    }
}