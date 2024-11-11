package bol01ej19;

import java.util.Scanner;

public class ej19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia1, mes1, año1;
        int dia2, mes2, año2;
        int totalDias;

        System.out.println("Fecha 1:");
        System.out.print("Introduzca día: ");
        dia1 = sc.nextInt();
        System.out.print("Introduzca mes: ");
        mes1 = sc.nextInt();
        System.out.print("Introduzca año: ");
        año1 = sc.nextInt();

        System.out.println("Fecha 2:");
        System.out.print("Introduzca día: ");
        dia2 = sc.nextInt();
        System.out.print("Introduzca mes: ");
        mes2 = sc.nextInt();
        System.out.print("Introduzca año: ");
        año2 = sc.nextInt();

        totalDias = (dia2 - dia1) + 30 * (mes2 - mes1) + 365 * (año2 - año1);
        System.out.println("Días de diferencia: " + totalDias);
    }
}
