package Teoría;

import java.util.ArrayList;

public class Teoria_ArrayList_Nivel2 {
    public static void main(String[] args) {
        // Realizar operaciones de:
        //  iteración y manipulación de elementos

        ArrayList<String> frutas = new ArrayList<>();

        frutas.add("Manzana");
        frutas.add("Plátano");
        frutas.add("Cereza");
        frutas.add("Aceituna");

        for (int i = 0; i < frutas.size(); i++) {
            System.out.println("Fruta " + (i+1) +": " + frutas.get(i));
        }

        // Imprimir usando un for-each
        for(String j : frutas) {
            System.out.println("Fruta: " + j);
        }

        // Eliminar un elemento:
        frutas.remove("Cereza");
        frutas.remove(1);
        System.out.println(frutas);

        // ArrayList de enteros donde se emplee lo siguiente:
        //  Buscar un elemento
        //  Clonar o copiar el ArrayList
        //  Vaciar o limpiar los elementos del ArrayList

        ArrayList<Integer> numeros = new ArrayList<>();

        //Agregar numeros
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);

        System.out.println(numeros);
        //Buscar un numero Si existe
        int numeroBuscado = 30;
        if(numeros.contains(numeroBuscado)) {
            System.out.println("El número " + numeroBuscado + " está en la lista");
        } else {
            System.out.println("El número " + numeroBuscado + " NO está en la lista");
        }

        // Clona el ArrayList

        ArrayList<Integer> copiaNumeros = (ArrayList<Integer>) numeros.clone();
        System.out.println("Copia de la lista numeros: " + copiaNumeros);

        // Limpio el Array

        numeros.clear();
        System.out.println("Lista original después de limpiar: " + numeros);

    }
}
