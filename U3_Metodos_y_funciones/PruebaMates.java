import java.util.Scanner;
import matematicas.Varias;

public class PruebaMates {
    public static void main(String[] args) {

        //Prueba esPrimo()
        System.out.println("Mete un numero entero positiv:");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

        if (Varias.esPrimo(numero)) {
            System.out.println("El numero " + numero + " es primo");
        } else {
            System.out.println("El numero " + numero + " no es primo");
        }
    }
}
