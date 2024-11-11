import java.util.Scanner;

public class BocadoTableta {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la anchura de la tablera: ");
        int anchura = sc.nextInt();
        System.out.println("Ingrese la altura de la tablera: ");
        int altura = sc.nextInt();

        int tamañoMordisco = 1;
        int posicionMordisco = (int)(Math.random()*(anchura*2 + (altura -2 )*2 - tamañoMordisco));

        int posicion = 0;

        for (int i = 0; i<altura; i++) {
            for (int j = 0; j<anchura; j++) {
                boolean estaEnBorde = (i == 0) || (i == altura -1) || (j == 0) || (j == anchura-1);

                if ((posicion >= posicionMordisco) && (posicion < posicionMordisco + tamañoMordisco) && (estaEnBorde)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
                if (estaEnBorde) {
                    posicion++;
                }
            }
            System.out.println();
        }
    }
}
