package Funciones;

import java.util.Scanner;

public class CalculadoraFiguras {

    public static void main(String[] args) {
        ejecutarCalculadora();
    }

    // Método principal que controla la ejecución del programa
    public static void ejecutarCalculadora() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = obtenerOpcion(scanner);
            ejecutarOpcion(opcion, scanner);
        } while (opcion != 4);

        scanner.close();
    }

    // Muestra el menú de opciones al usuario
    public static void mostrarMenu() {
        System.out.println("\n🔷 Calculadora de Figuras Geométricas 🔷");
        System.out.println("1. Círculo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Triángulo");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
    }

    // Obtiene la opción seleccionada por el usuario
    public static int obtenerOpcion(Scanner scanner) {
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea
        return opcion;
    }

    // Ejecuta la opción seleccionada por el usuario
    public static void ejecutarOpcion(int opcion, Scanner scanner) {
        switch (opcion) {
            case 1:
                calcularCirculo(scanner);
                break;
            case 2:
                calcularCuadrado(scanner);
                break;
            case 3:
                calcularTriangulo(scanner);
                break;
            case 4:
                System.out.println("Saliendo del programa... ¡Hasta luego!");
                break;
            default:
                System.out.println("⚠ Opción no válida. Intente nuevamente.");
        }
    }

    // --------------------- CÁLCULO DEL CÍRCULO ---------------------

    public static void calcularCirculo(Scanner scanner) {
        double radio = obtenerValorPositivo(scanner, "Ingrese el radio del círculo: ");
        mostrarResultadosCirculo(radio);
    }

    public static void mostrarResultadosCirculo(double radio) {
        double area = calcularAreaCirculo(radio);
        double perimetro = calcularPerimetroCirculo(radio);
        System.out.printf("✅ Área: %.2f\n", area);
        System.out.printf("✅ Perímetro: %.2f\n", perimetro);
    }

    public static double calcularAreaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    public static double calcularPerimetroCirculo(double radio) {
        return 2 * Math.PI * radio;
    }

    // --------------------- CÁLCULO DEL CUADRADO ---------------------

    public static void calcularCuadrado(Scanner scanner) {
        double lado = obtenerValorPositivo(scanner, "Ingrese el lado del cuadrado: ");
        mostrarResultadosCuadrado(lado);
    }

    public static void mostrarResultadosCuadrado(double lado) {
        double area = calcularAreaCuadrado(lado);
        double perimetro = calcularPerimetroCuadrado(lado);
        System.out.printf("✅ Área: %.2f\n", area);
        System.out.printf("✅ Perímetro: %.2f\n", perimetro);
    }

    public static double calcularAreaCuadrado(double lado) {
        return lado * lado;
    }

    public static double calcularPerimetroCuadrado(double lado) {
        return 4 * lado;
    }

    // --------------------- CÁLCULO DEL TRIÁNGULO ---------------------

    public static void calcularTriangulo(Scanner scanner) {
        double base = obtenerValorPositivo(scanner, "Ingrese la base del triángulo: ");
        double altura = obtenerValorPositivo(scanner, "Ingrese la altura del triángulo: ");
        double lado1 = obtenerValorPositivo(scanner, "Ingrese el primer lado del triángulo: ");
        double lado2 = obtenerValorPositivo(scanner, "Ingrese el segundo lado del triángulo: ");

        mostrarResultadosTriangulo(base, altura, lado1, lado2);
    }

    public static void mostrarResultadosTriangulo(double base, double altura, double lado1, double lado2) {
        double area = calcularAreaTriangulo(base, altura);
        double perimetro = calcularPerimetroTriangulo(base, lado1, lado2);
        System.out.printf("✅ Área: %.2f\n", area);
        System.out.printf("✅ Perímetro: %.2f\n", perimetro);
    }

    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    public static double calcularPerimetroTriangulo(double base, double lado1, double lado2) {
        return base + lado1 + lado2;
    }

    // --------------------- VALIDACIÓN DE VALORES POSITIVOS ---------------------

    public static double obtenerValorPositivo(Scanner scanner, String mensaje) {
        double valor;
        do {
            System.out.print(mensaje);
            while (!scanner.hasNextDouble()) {
                System.out.println("⚠ Entrada no válida. Introduzca un número positivo.");
                System.out.print(mensaje);
                scanner.next(); // Descartar entrada inválida
            }
            valor = scanner.nextDouble();
            if (valor <= 0) {
                System.out.println("⚠ El valor debe ser mayor que 0. Inténtelo de nuevo.");
            }
        } while (valor <= 0);
        return valor;
    }
}

