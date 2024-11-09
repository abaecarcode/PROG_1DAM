package Teoría;

import javax.swing.*;

public class JOptionPane_entrada_usuario {
    public static void main(String[] args) {
        String [] paises = new String[2];

        for (int i = 0; i < 2; i++) {
            paises[i] = JOptionPane.showInputDialog("Introduce el país " + (i + 1) + ":");
        }
        for (String pais : paises) {
            System.out.println(pais);
        }
    }
}
