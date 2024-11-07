package Ejercicios;

import java.util.ArrayList;

public class Arrays_Aleatorios {
    public static void main(String[] args) {

        ArrayList<Integer> original = new ArrayList<>(20);
        ArrayList<Integer> par = new ArrayList<>();
        ArrayList<Integer> impar = new ArrayList<>();

        System.out.println("Original vacio: " + original);
        for (int i = 0; i < 20; i++) {
            int numaleatorio = (int) (Math.random() * 101);
            original.add(numaleatorio);
        }
        System.out.println("Original aleatorios: " + original);

        for(int item : original) {
            if(item % 2 == 0) {
                par.add(item);
            } else {
                impar.add(item);
            }
        }
        original.clear();

        for(int item : par) {
            original.add(item);
        }
        for(int item : impar) {
            original.add(item);
        }
        System.out.println("Array original despues de vaciarlo: " + original);
    }
}
