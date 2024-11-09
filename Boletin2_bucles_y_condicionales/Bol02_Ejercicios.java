import java.util.Scanner;

public class Bol02_Ejercicios {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("Selecciona un ejercicio:");
            for (int i = 1; i <= 23; i++) {
                System.out.println("Ejercicio " + i);
            }
            System.out.println("0. Salir");
            System.out.print("Aquí su opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> ejercicio1();
                case 2 -> ejercicio2();
                case 3 -> ejercicio3();
                case 4 -> ejercicio4();
                case 5 -> ejercicio5();
                case 6 -> ejercicio6();
                case 7 -> ejercicio7();
                case 8 -> ejercicio8();
                case 9 -> ejercicio9();
                case 10 -> ejercicio10();
                case 11 -> ejercicio11();
                case 12 -> ejercicio12();
                case 13 -> ejercicio13();
                case 14 -> ejercicio14();
                case 15 -> ejercicio15();
                case 16 -> ejercicio16();
                case 17 -> ejercicio17();
                case 18 -> ejercicio18();
                case 19 -> ejercicio19();
                case 20 -> ejercicio20();
                case 21 -> ejercicio21();
                case 22 -> ejercicio22();
                case 23 -> ejercicio23();
                case 0 -> System.out.println("Saliendo del programa.");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
    }

    // Ejercicio 1
    public static void ejercicio1() {
        int num;
        System.out.print("Introduzca número: ");
        num = sc.nextInt();
        while (num >= 0) {
            System.out.println(num + "² es igual a " + (num * num));
            System.out.print("Introduzca otro número: ");
            num = sc.nextInt();
        }
    }

    // Ejercicio 2
    public static void ejercicio2() {
        int num;
        System.out.print("Introduzca un número: ");
        num = sc.nextInt();
        while (num != 0) {
            if (num > 0) {
                System.out.println("Positivo");
            } else {
                System.out.println("Negativo");
            }
            System.out.print("Introduzca un número: ");
            num = sc.nextInt();
        }
    }

    // Ejercicio 3
    public static void ejercicio3() {
        int num;
        System.out.print("Introduzca un número: ");
        num = sc.nextInt();
        while (num != 0) {
            if (num % 2 == 0) {
                System.out.println("Par");
            } else {
                System.out.println("Impar");
            }
            System.out.print("Introduzca otro número: ");
            num = sc.nextInt();
        }
    }

    // Ejercicio 4
    public static void ejercicio4() {
        int num, contador = 0;
        System.out.print("Introduzca un número: ");
        num = sc.nextInt();
        while (num >= 0) {
            contador++;
            System.out.print("Introduzca otro número: ");
            num = sc.nextInt();
        }
        System.out.println("Se han introducido " + contador + " números.");
    }

    // Ejercicio 5
    public static void ejercicio5() {
        int n, num;
        System.out.print("Introduce N: ");
        n = sc.nextInt();
        System.out.print("Introduce número: ");
        num = sc.nextInt();
        while (num != n) {
            System.out.println(num > n ? "menor" : "mayor");    // If else realizado con el operador ternario. ? indica condicion y : indica else
            System.out.print("Introduce número: ");
            num = sc.nextInt();
        }
        System.out.println("acertaste...");
    }

    // Ejercicio 6
    public static void ejercicio6() {
        int num, suma = 0;
        do {
            System.out.print("Introduzca un número: ");
            num = sc.nextInt();
            suma += num;
        } while (num != 0);
        System.out.println("La suma de todos los números es: " + suma);
    }

    // Ejercicio 7
    public static void ejercicio7() {
        int num, suma = 0, elementos = 0;
        System.out.print("Introduzca un número: ");
        num = sc.nextInt();
        while (num >= 0) {
            suma += num;
            elementos++;
            System.out.print("Introduzca otro número: ");
            num = sc.nextInt();
        }
        if (elementos == 0) System.out.println("Imposible hacer la media");
        else System.out.println("La media es: " + (float) suma / elementos);
    }

    // Ejercicio 8
    public static void ejercicio8() {
        int num;
        System.out.print("Introduce un número: ");
        num = sc.nextInt();
        for (int i = 1; i <= num; i++) System.out.println(i);   // for sin llaves en una línea
    }

    // Ejercicio 9
    public static void ejercicio9() {
        for (int i = 100; i >= 0; i -= 7) System.out.println(i);
    }

    // Ejercicio 10
    public static void ejercicio10() {
        int sumaTotal = 0;
        for (int i = 1; i <= 15; i++) {
            System.out.print("Introduzca número: ");
            sumaTotal += sc.nextInt();
        }
        System.out.println("La suma total es de: " + sumaTotal);
    }

    // Ejercicio 11
    public static void ejercicio11() {
        long producto = 1;
        for (int i = 1; i < 20; i += 2) producto *= i;
        System.out.println("La multiplicación de los 10 primeros impares es: " + producto);
    }

    // Ejercicio 12
    public static void ejercicio12() {
        System.out.print("Introduce un número: ");
        int num = sc.nextInt();
        double factorial = 1;
        for (int i = num; i > 0; i--) factorial *= i;
        System.out.println("El factorial de " + num + " es: " + factorial);
    }

    // Ejercicio 13
    public static void ejercicio13() {
        int contPos = 0, contNeg = 0, contCeros = 0, sumaPos = 0, sumaNeg = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Introduce número: ");
            int num = sc.nextInt();
            if (num == 0) contCeros++;
            else if (num > 0) {
                contPos++; sumaPos += num;
            } else { contNeg++; sumaNeg += num; }
        }
        System.out.println("Ceros: " + contCeros);
        if (contPos > 0) System.out.println("Media positivos: " + (float) sumaPos / contPos);
        if (contNeg > 0) System.out.println("Media negativos: " + (float) sumaNeg / contNeg);
    }

    // Ejercicio 14
    public static void ejercicio14() {
        int suma = 0, mayor1000 = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Introduce sueldo: ");
            int sueldo = sc.nextInt();
            if (sueldo > 1000) mayor1000++;
            suma += sueldo;
        }
        System.out.println("Suma total: " + suma + ", Sueldos > 1000: " + mayor1000);
    }

    // Ejercicio 15
    public static void ejercicio15() {
        int mayores18 = 0, mayores175 = 0, sumaEdades = 0;
        double sumaAlturas = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Edad del alumno: ");
            int edad = sc.nextInt();
            System.out.print("Altura del alumno: ");
            double altura = sc.nextDouble();
            if (edad > 18) mayores18++;
            if (altura > 1.75) mayores175++;
            sumaEdades += edad;
            sumaAlturas += altura;
        }
        System.out.println("Edad media: " + (sumaEdades / 5.0));
        System.out.println("Altura media: " + (sumaAlturas / 5.0));
        System.out.println("Mayores de 18 años: " + mayores18);
        System.out.println("Mayores de 1.75m: " + mayores175);
    }

    // Ejercicio 16
    public static void ejercicio16() {
        int num;
        do {
            System.out.print("Introduce un número (de 0 a 10): ");
            num = sc.nextInt();
        } while (num < 0 || num > 10);

        System.out.println("\nTabla del " + num);
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    // Ejercicio 17
    public static void ejercicio17() {
        float facturacionTotal = 0;
        int litrosCod1 = 0, mas600 = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Código de producto: ");
            int codigo = sc.nextInt();
            System.out.print("Cantidad (litros): ");
            int litros = sc.nextInt();
            System.out.print("Precio (por litro): ");
            float precio = sc.nextFloat();

            float importeFactura = litros * precio;
            facturacionTotal += importeFactura;
            if (codigo == 1) {
                litrosCod1 += litros;
            }
            if (importeFactura > 600) {
                mas600++;
            }
        }
        System.out.println("Facturación total: " + facturacionTotal);
        System.out.println("Litros vendidos del producto 1: " + litrosCod1);
        System.out.println("Facturas superiores a 600€: " + mas600);
    }

    // Ejercicio 18
    public static void ejercicio18() {
        float facturacionTotal = 0;
        int litrosCod1 = 0, mas600 = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Código de producto (1, 2, 3): ");
            int codigo = sc.nextInt();
            System.out.print("Cantidad (litros): ");
            int litros = sc.nextInt();

            float precio;
            if (codigo == 1) {
                precio = 0.6f;
            } else if (codigo == 2) {
                precio = 3f;
            } else if (codigo == 3) {
                precio = 1.25f;
            } else {
                System.out.println("Código de producto incorrecto.");
                continue;
            }

            float importeFactura = litros * precio;
            facturacionTotal += importeFactura;
            if (codigo == 1) {
                litrosCod1 += litros;
            }
            if (importeFactura > 600) {
                mas600++;
            }
        }
        System.out.println("Facturación total: " + facturacionTotal);
        System.out.println("Litros vendidos del producto 1: " + litrosCod1);
        System.out.println("Facturas superiores a 600€: " + mas600);
    }

    // Ejercicio 19
    public static void ejercicio19() {
        int aprobados = 0, suspensos = 0, condicionados = 0;
        for (int i = 1; i <= 6; i++) {
            System.out.print("Introduzca nota entre 0 y 10: ");
            int nota = sc.nextInt();
            if (nota == 4) {
                condicionados++;
            } else if (nota >= 5) {
                aprobados++;
            } else {
                suspensos++;
            }
        }
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Condicionados: " + condicionados);
        System.out.println("Suspensos: " + suspensos);
    }

    // Ejercicio 20
    public static void ejercicio20() {
        System.out.print("Número de sueldos a introducir: ");
        int n = sc.nextInt();
        int sueldoMax = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            System.out.print("Introduce sueldo: ");
            int sueldo = sc.nextInt();
            if (sueldo > sueldoMax) {
                sueldoMax = sueldo;
            }
        }
        System.out.println("El sueldo máximo es: " + sueldoMax);
    }

    // Ejercicio 21
    public static void ejercicio21() {
        boolean hayNegativo = false;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Introduce número: ");
            int num = sc.nextInt();
            if (num < 0) {
                hayNegativo = true;
            }
        }
        if (hayNegativo) {
            System.out.println("Se ha introducido algún número negativo");
        } else {
            System.out.println("No hay ningún número negativo");
        }
    }

    // Ejercicio 22
    public static void ejercicio22() {
        boolean suspensos = false;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Introduzca nota (de 0 a 10): ");
            int nota = sc.nextInt();
            if (nota < 5) {
                suspensos = true;
            }
        }
        if (suspensos) {
            System.out.println("Hay alumnos suspensos");
        } else {
            System.out.println("No hay suspensos");
        }
    }

    // Ejercicio 23
    public static void ejercicio23() {
        boolean multiplo3 = false;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Introduzca número: ");
            int num = sc.nextInt();
            if (num % 3 == 0) {
                multiplo3 = true;
            }
        }
        if (multiplo3) {
            System.out.println("Hay múltiplos de 3");
        } else {
            System.out.println("No hay múltiplos de 3");
        }
    }
}
