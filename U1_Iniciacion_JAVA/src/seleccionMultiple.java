
/* Se pide al usuario el número de mes y el programa da el nombre del  mes que corresponde a ese numero*/

import java.util.Scanner;

public class seleccionMultiple {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int op;
        String nombredelmes;

        System.out.println("Por favor, introduzca numero de mes");
        op = sc.nextInt();

        switch (op) {
            case 1:
                nombredelmes = "enero";
                break;
            case 2:
                nombredelmes = "febrero";
                break;
            default:
                nombredelmes = "No existe ese mes)";
        }
        System.out.println(nombredelmes);
    }
}
