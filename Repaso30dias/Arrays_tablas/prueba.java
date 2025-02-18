package Arrays_tablas;

import java.util.Scanner;

public class prueba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] t = new int[10];
        for (int i = 0; i < t.length; i++) {
            System.out.print("Introduzca un número: ");
            t[i] = sc.nextInt();
        }
    }

}
