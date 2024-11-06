import java.util.Scanner;

public class bol01Completo_Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("===== MENÚ DE EJERCICIOS =====");
            System.out.println("1. Ejercicio 1: []");
            System.out.println("2. Ejercicio 2: []");
            System.out.println("3. Ejercicio 3: []");
            System.out.println("4. Ejercicio 4: []");
            System.out.println("5. Ejercicio 5: []");
            System.out.println("6. Ejercicio 6: []");
            System.out.println("7. Ejercicio 7: []");
            System.out.println("8. Ejercicio 8: []");
            System.out.println("9. Ejercicio 9: []");
            System.out.println("10. Ejercicio 10: []");
            System.out.println("11. Ejercicio 11: []");
            System.out.println("12. Ejercicio 12: []");
            System.out.println("13. Ejercicio 13: []");
            System.out.println("14. Ejercicio 14: []");
            System.out.println("15. Ejercicio 15: [Validar Fecha con Meses de 30 Días]");
            System.out.println("16. Ejercicio 16: [Validar Fecha con Meses de 28, 30 y 31 Días (Sin Años Bisiestos)]");
            System.out.println("17. Ejercicio 17: [Mostrar el Día Siguiente en Meses de 30 Días]");
            System.out.println("18. Ejercicio 18: [Mostrar el Día Siguiente con Días Variables por Mes]");
            System.out.println("19. Ejercicio 19: [Calcular Diferencia en Días entre Dos Fechas (Meses de 30 Días]");
            System.out.println("20. Ejercicio 20: [Mostrar la Hora en el Segundo Siguiente]");
            System.out.println("21. Ejercicio 21: [Mostrar Nota como Texto (0-10)]");
            System.out.println("22. Ejercicio 22: [Convertir Número de 0 a 99 a Texto]");
            System.out.println("0. Salir");
            System.out.print("Seleccione el ejercicio que desea ejecutar: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1: ejercicio1(); break;
                case 2: ejercicio2(); break;
                case 3: ejercicio3(); break;
                case 4: ejercicio4(); break;
                case 5: ejercicio5(); break;
                case 6: ejercicio6(); break;
                case 7: ejercicio7(); break;
                case 8: ejercicio8(); break;
                case 9: ejercicio9(); break;
                case 10: ejercicio10(); break;
                case 11: ejercicio11(); break;
                case 12: ejercicio12(); break;
                case 13: ejercicio13(); break;
                case 14: ejercicio14(); break;
                case 15: ejercicio15(); break;
                case 16: ejercicio16(); break;
                case 17: ejercicio17(); break;
                case 18: ejercicio18(); break;
                case 19: ejercicio19(); break;
                case 20: ejercicio20(); break;
                case 21: ejercicio21(); break;
                case 22: ejercicio22(); break;
                case 0: System.out.println("Saliendo del programa..."); break;
                default: System.out.println("Opción no válida. Intente de nuevo.");
            }
            System.out.println();
        } while (opcion != 0);
    }

    // Ejercicio 1
    public static void ejercicio1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        int num1 = sc.nextInt();
        System.out.print("Introduce el segundo número: ");
        int num2 = sc.nextInt();
        System.out.println("Resultado de la multiplicación: " + (num1 * num2));
    }

    // Ejercicio 2
    public static void ejercicio2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la cantidad en euros: ");
        double euros = sc.nextDouble();
        System.out.println("Equivalente en pesetas: " + (euros * 166.386));
    }

    // Ejercicio 3
    public static void ejercicio3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la cantidad en pesetas: ");
        double pesetas = sc.nextDouble();
        System.out.println("Equivalente en euros: " + (pesetas / 166.386));
    }

    // Ejercicio 4
    public static void ejercicio4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        int num1 = sc.nextInt();
        System.out.print("Introduce el segundo número: ");
        int num2 = sc.nextInt();
        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicación: " + (num1 * num2));
        System.out.println("División: " + (num1 / (double) num2));
    }

    // Ejercicio 5
    public static void ejercicio5() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la base del rectángulo: ");
        double base = sc.nextDouble();
        System.out.print("Introduce la altura del rectángulo: ");
        double altura = sc.nextDouble();
        System.out.println("Área del rectángulo: " + (base * altura));
    }

    // Ejercicio 6
    public static void ejercicio6() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la base del triángulo: ");
        double base = sc.nextDouble();
        System.out.print("Introduce la altura del triángulo: ");
        double altura = sc.nextDouble();
        System.out.println("Área del triángulo: " + (base * altura / 2));
    }

    // Ejercicio 7
    public static void ejercicio7() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la base imponible: ");
        double baseImponible = sc.nextDouble();
        System.out.println("Total factura con IVA (21%): " + (baseImponible * 1.21));
    }

    // Ejercicio 8
    public static void ejercicio8() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce las horas trabajadas: ");
        int horas = sc.nextInt();
        System.out.println("Salario semanal: " + (horas * 12) + " euros");
    }

    // Ejercicio 9
    public static void ejercicio9() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la cantidad en Mb: ");
        double mb = sc.nextDouble();
        System.out.println("Equivalente en Kb: " + (mb * 1024));
    }

    // Ejercicio 10
    public static void ejercicio10() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la cantidad en Kb: ");
        double kb = sc.nextDouble();
        System.out.println("Equivalente en Mb: " + (kb / 1024));
    }

    // Ejercicio 11
    public static void ejercicio11() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la nota del primer examen: ");
        double nota1 = sc.nextDouble();
        System.out.print("Introduce la nota deseada: ");
        double notaDeseada = sc.nextDouble();
        double nota2 = (notaDeseada - (nota1 * 0.4)) / 0.6;
        System.out.println("Nota necesaria en el segundo examen: " + nota2);
    }

    // Ejercicio 12
    public static void ejercicio12() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número de 0 a 9999: ");
        int numero = sc.nextInt();
        if (numero < 10) System.out.println("Tiene 1 cifra");
        else if (numero < 100) System.out.println("Tiene 2 cifras");
        else if (numero < 1000) System.out.println("Tiene 3 cifras");
        else System.out.println("Tiene 4 cifras");
    }

    // Ejercicio 13
    public static void ejercicio13() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();
        System.out.print("Cifras al revés: ");
        while (numero > 0) {
            System.out.print(numero % 10);
            numero /= 10;
        }
        System.out.println();
    }

    // Ejercicio 14
    public static void ejercicio14() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();
        System.out.println("Dígitos: " + Integer.toString(numero).length());
    }

    // Ejercicio 15
    public static void ejercicio15() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce día: ");
        int dia = sc.nextInt();
        System.out.print("Introduce mes: ");
        int mes = sc.nextInt();
        System.out.print("Introduce año: ");
        int año = sc.nextInt();
        if (dia >= 1 && dia <= 30 && mes >= 1 && mes <= 12 && año != 0) {
            System.out.println("Fecha correcta");
        } else {
            System.out.println("Fecha incorrecta");
        }
    }

    // Ejercicio 16
    public static void ejercicio16() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce día: ");
        int dia = sc.nextInt();
        System.out.print("Introduce mes: ");
        int mes = sc.nextInt();
        System.out.print("Introduce año: ");
        int año = sc.nextInt();
        boolean fechaCorrecta = false;

        if (año != 0 && mes >= 1 && mes <= 12) {
            int diasDelMes;
            if (mes == 2) diasDelMes = 28;
            else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) diasDelMes = 30;
            else diasDelMes = 31;

            if (dia >= 1 && dia <= diasDelMes) fechaCorrecta = true;
        }

        System.out.println(fechaCorrecta ? "Fecha correcta" : "Fecha incorrecta");
    }

    // Ejercicio 17
    public static void ejercicio17() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce día: ");
        int dia = sc.nextInt();
        System.out.print("Introduce mes: ");
        int mes = sc.nextInt();
        System.out.print("Introduce año: ");
        int año = sc.nextInt();

        dia++;
        if (dia > 30) {
            dia = 1;
            mes++;
            if (mes > 12) {
                mes = 1;
                año++;
                if (año == 0) año = 1;
            }
        }

        System.out.println("Fecha del día siguiente: " + dia + "/" + mes + "/" + año);
    }

    // Ejercicio 18
    public static void ejercicio18() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce día: ");
        int dia = sc.nextInt();
        System.out.print("Introduce mes: ");
        int mes = sc.nextInt();
        System.out.print("Introduce año: ");
        int año = sc.nextInt();
        int diasDelMes;

        if (mes == 2) diasDelMes = 28;
        else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) diasDelMes = 30;
        else diasDelMes = 31;

        dia++;
        if (dia > diasDelMes) {
            dia = 1;
            mes++;
            if (mes > 12) {
                mes = 1;
                año++;
                if (año == 0) año = 1;
            }
        }

        System.out.println("Fecha del día siguiente: " + dia + "/" + mes + "/" + año);
    }

    // Ejercicio 19
    public static void ejercicio19() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Fecha 1 - Día: ");
        int dia1 = sc.nextInt();
        System.out.print("Mes: ");
        int mes1 = sc.nextInt();
        System.out.print("Año: ");
        int año1 = sc.nextInt();

        System.out.print("Fecha 2 - Día: ");
        int dia2 = sc.nextInt();
        System.out.print("Mes: ");
        int mes2 = sc.nextInt();
        System.out.print("Año: ");
        int año2 = sc.nextInt();

        int totalDias1 = dia1 + mes1 * 30 + año1 * 365;
        int totalDias2 = dia2 + mes2 * 30 + año2 * 365;

        System.out.println("Días de diferencia: " + Math.abs(totalDias2 - totalDias1));
    }

    // Ejercicio 20
    public static void ejercicio20() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce hora: ");
        int h = sc.nextInt();
        System.out.print("Introduce minutos: ");
        int m = sc.nextInt();
        System.out.print("Introduce segundos: ");
        int s = sc.nextInt();

        s++;
        if (s == 60) {
            s = 0;
            m++;
            if (m == 60) {
                m = 0;
                h++;
                if (h == 24) h = 0;
            }
        }

        System.out.println("Hora en el segundo siguiente: " + h + ":" + m + ":" + s);
    }

    // Ejercicio 21
    public static void ejercicio21() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una nota numérica entre 0 y 10: ");
        int num = sc.nextInt();

        String[] notas = {"CERO", "UNO", "DOS", "TRES", "CUATRO", "CINCO", "SEIS", "SIETE", "OCHO", "NUEVE", "DIEZ"};
        System.out.println(notas[num]);
    }

    // Ejercicio 22
    public static void ejercicio22() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número de 0 a 99: ");
        int numero = sc.nextInt();

        String[] decenasStr = {"", "diez", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa"};
        String[] unidadesStr = {"", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};
        int decenas = numero / 10;
        int unidades = numero % 10;

        System.out.print(decenasStr[decenas]);
        if (decenas > 1 && unidades > 0) System.out.print(" y ");
        System.out.println(unidadesStr[unidades]);
    }
}