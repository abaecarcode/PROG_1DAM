package Variables;

public class CharComoInt {
    public static void main(String[] args) {

        char letra1 = 'a';
        char letra2 = 'b';

        System.out.println(letra1);
        System.out.println(letra2);

        System.out.println(letra1 + letra2);    //Out: 195
        System.out.println(letra1 + "" + letra2);

        System.out.println('a' + 7);

        // letra1 + letra2 en realidad es la suma de los códigos ASCII de la 'a' (97) y de la 'b' (98). En Java se podrían escribir cosas como 'a' + 7 sin que diera un error
    }
}
