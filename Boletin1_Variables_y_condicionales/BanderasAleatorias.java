
/*PROGRAMA QUE GENERA UNA BANDERA DE COLORES ALEATORIOS EMPLEANDO UN ARRAY DE CADENA DE CARACTERES PARA ALMACENAR COLORES*/

import java.util.Scanner;

public class BanderasAleatorias {
    public static void main(String[] args) {

        String[] color = {"rojo", "amarillo", "verde", "blanco", "azul", "negro"};

        Scanner sc = new Scanner(System.in);
        System.out.println("Cuántas franjas quiere para la bandera? ");
        int franjas = sc.nextInt();

        System.out.println("---------------");
        for (int i = 0; i < franjas; i++) {
            System.out.println(color[(int)(Math.random() * color.length)]);
            System.out.println("---------------");
        }
    }
}
