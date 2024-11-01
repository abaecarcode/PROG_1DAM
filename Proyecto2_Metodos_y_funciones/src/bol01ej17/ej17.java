package bol01ej17;

import java.util.Scanner;
// Ejercicio 17: Mostrar el Día Siguiente en Meses de 30 Días
public class ej17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, mes, año;

        System.out.print("Introduzca día: ");
        dia = sc.nextInt();
        System.out.print("Introduzca mes: ");
        mes = sc.nextInt();
        System.out.print("Introduzca año: ");
        año = sc.nextInt();

        // Incrementar el día
        dia++;

        // Si el día supera 30, reiniciarlo y aumentar el mes
        if (dia > 30) {
            dia = 1;
            mes++;
        }

        // Si el mes supera 12, reiniciarlo y aumentar el año
        if (mes > 12) {
            mes = 1;
            año++;
        }

        if (año == 0) año = 1; // Evitar el año 0

        System.out.println("Fecha del día siguiente: " + dia + "/" + mes + "/" + año);
    }
}
