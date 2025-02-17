import java.util.Scanner;

// Cuadrado dibujado de n elementos de lado utilizando * (asteriscos)

public class Ej4bol3_Cuadrado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Número de lados: ");
        int lados = teclado.nextInt();

        for (int i = 0; i < lados; i++) {
            System.out.print("* ");
        }
        System.out.println();

        for (int i = 0; i < lados-2; i++) {
            System.out.print("* ");
            for (int j = 0; j < lados-2; j++) {
                System.out.print("  ");
            }
            System.out.println("* ");
        }

        for (int i = 0; i < lados; i++) {
            System.out.print("* ");
        }

    }
}
