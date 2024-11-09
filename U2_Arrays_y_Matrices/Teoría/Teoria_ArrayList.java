package Teoría;

import java.util.ArrayList;
import java.util.Arrays;

public class Teoria_ArrayList {
    public static void main(String[] args) {

        // Un ArrayList es lo que conocíamos en Py como LISTA
        // Un ArrayList es una estructura de datos en Java que permite almacenar elementos de forma dinámica.

        // Ventaja sobre Array: No necesito definir su tamaño de antemano.

        ArrayList<String> nombres = new ArrayList<>();
        String[] n = {"Pepe", "Juan"};
        // Agregar elementos al ArrayList:
        nombres.add("Ester");
        nombres.add("Juan");
        nombres.add("Ricardo");

        System.out.println("Lista de nombres: " + nombres);
        System.out.println(Arrays.toString(n));

        // Acceder a un elemento específico:
        System.out.println("Primer nombre: " + nombres.get(0));
        System.out.println("Segundo nombre: " + nombres.get(1));

        // Cambiar un elemento:
        nombres.set(1, "Carmen");
        System.out.println("Lista actualizada: " + nombres);

        /*

        * add(): Metodo para agregar items
        * get(): Permite acceder a un elemento por su index
        * set(): Cambia un elemento en una posicion especifica
        *
        * */



    }
}
