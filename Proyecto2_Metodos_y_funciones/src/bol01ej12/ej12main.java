package bol01ej12;

//12. Pedir un número entre 0 y 9.999 y mostrarlo con las cifras al revés.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ej12main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese un numero: ");
        int num = Integer.parseInt(br.readLine());
        String cad;
        cad = String.valueOf(num);
        try {
            if (num < 0 || num > 10000) {
                System.out.println("El numero debe estar entre 0 y 10000");
            } else {
                for (int i = cad.length() - 1; i >= 0; i--) {
                    System.out.print(cad.charAt(i));
                }
                }
            } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
