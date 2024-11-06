package bol01ej20;

import java.util.Scanner;

public class ej20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h, m, s;

        System.out.print("Introduzca hora: ");
        h = sc.nextInt();
        System.out.print("Introduzca minutos: ");
        m = sc.nextInt();
        System.out.print("Introduzca segundos: ");
        s = sc.nextInt();

        s++;

        if (s >= 60) {
            s = 0;
            m++;
        }
        if (m >= 60) {
            m = 0;
            h++;
        }
        if (h >= 24) {
            h = 0;
        }
        System.out.println("Hora: " + h + ":" + m + ":" + s);
    }
}
