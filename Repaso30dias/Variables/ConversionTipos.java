package Variables;

public class ConversionTipos {
    public static void main(String[] args) {

        /*  (Conversión de tipos o Casting)
        * En ocasiones es necesario convertir una variable (o una expresión en general) de un tipo a otro. Símplemente hay que escribir entre paréntesis el tipo que se quiere obtenir
        *
        * */

        int x = 2;
        int y = 9;
        double division;

        division = (double) x/ (double) y;

        System.out.println(division);
    }
}
