package bol01ej18;
// Ejercicio 18: Mostrar el Día Siguiente con Días Variables por Mes
import java.util.Scanner;

public class ej18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, mes, año;
        int diasDelMes = 0;

        System.out.print("Introduzca día: ");
        dia = sc.nextInt();
        System.out.print("Introduzca mes: ");
        mes = sc.nextInt();
        System.out.print("Introduzca año: ");
        año = sc.nextInt();

        if (mes == 2) diasDelMes = 28;
        else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) diasDelMes = 30;
        else if (mes >= 1 && mes <= 12) diasDelMes = 31;

        dia++;

        if (dia > diasDelMes) {
            dia = 1;
            mes++;
        }

        if (mes > 12) {
            mes = 1;
            año++;
        }

        if (año == 0) año = 1; // Evitar el año 0

        System.out.println("Fecha del día siguiente: " + dia + "/" + mes + "/" + año);
    }
}
