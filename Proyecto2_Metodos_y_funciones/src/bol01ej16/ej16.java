package bol01ej16;
//Ejercicio 16: Validar Fecha con Meses de 28, 30 y 31 Días (Sin Años Bisiestos)
import java.util.Scanner;

public class ej16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, mes, año;

        System.out.print("Introduzca día: ");
        dia = sc.nextInt();
        System.out.print("Introduzca mes: ");
        mes = sc.nextInt();
        System.out.print("Introduzca año: ");
        año = sc.nextInt();

        boolean fechaCorrecta = false;

        if (año != 0) {
            if (mes == 2 && dia >= 1 && dia <= 28) {
                fechaCorrecta = true;
            } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia >= 1 && dia <= 30) {
                fechaCorrecta = true;
            } else if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && dia >= 1 && dia <= 31) {
                fechaCorrecta = true;
            }
        }

        if (fechaCorrecta) {
            System.out.println(dia + "/" + mes + "/" + año + ": Fecha correcta");
        } else {
            System.out.println("Fecha incorrecta");
        }
    }
}
