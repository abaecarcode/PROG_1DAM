package Ejercicios.POO_1_Intermedios;

public class Ej10_PruebAmeba {
    public static void main(String[] args) {
<<<<<<< HEAD
        Ameba a1 = new Ameba();
        a1.come(2);
        System.out.println(a1);
        Ameba a2 = new Ameba();
        a2.come(4);
        System.out.println(a2);
        a1.come(a2);
        System.out.println(a1);
=======


        Ameba a1 = new Ameba("Pepito");
        System.out.println(a1); //Aquí veo que cuando instancio el objeto ameba a1, se inicia en peso 3
        a1.come(2);
        System.out.println(a1); //Out: 4

        Ameba a2 = new Ameba("Manolito");
        System.out.println("Ameba 2 come 4 microgramos");
        a2.come(4);
        System.out.println(a2);

        //Una ameba se come a otra ameba
        System.out.println("Ameba 1 se come a la Ameba 2: ");
        a1.come(a2);
        System.out.println(a1);
        System.out.println("Peso actual de la Ameba 2: ");
>>>>>>> 104b1d55dd8d858875430979becdda81b74fe333
        System.out.println(a2);
        a2.come(3);
        System.out.println(a2);
    }
}
