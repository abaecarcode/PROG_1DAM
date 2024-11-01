package bol01ej15;
//Ejercicio 15: Validar Fecha con Meses de 30 Días
import java.util.Scanner;

public class ej15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, mes, año;

        System.out.print("Introduzca día: ");
        dia = sc.nextInt();
        System.out.print("Introduzca mes: ");
        mes = sc.nextInt();
        System.out.print("Introduzca año: ");
        año = sc.nextInt();

        if (dia >= 1 && dia <= 30 && mes >= 1 && mes <= 12 && año != 0) {
            System.out.println("Fecha correcta");
        } else {
            if (dia < 1 || dia > 30) {
                System.out.println("Día incorrecto");
            } else if (mes < 1 || mes > 12) {
                System.out.println("Mes incorrecto");
            } else {
                System.out.println("Año incorrecto");
            }
        }
    }
}
