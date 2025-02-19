package Bucles;

import java.util.Scanner;

public class DibujarEle {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca altura de la L");
        int altura = entrada.nextInt();

        for (int i = 0; i < altura; i++) {
            System.out.println("*");
        }
        for (int i = 0; i < altura/2 + 1; i++) {
            System.out.print("* ");
        }
    }
}
