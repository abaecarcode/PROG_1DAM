// Bucle POR - CADA. FOR - EACH
public class ArrayForeach {
    public static void main(String[] args) {

        /*String [] paises = new String[8];
        paises[0] = "España";
        paises[1] = "México";
        paises[2] = "Colombia";
        paises[3] = "Perú";
        paises[4] = "Chile";
        paises[5] = "Argentina";
        paises[6] = "Ecuador";
        paises[7] = "Venezuela";*/

        String [] paises = {"España", "México", "Colombia", "Perú", "Chile", "Argentina", "Ecuador", "Venezuela"};

        // Recorremos la matriz con un bucle for normal:
        for (int i = 0; i < paises.length; i++) {
            System.out.println("País "+ (i + 1)  + ": " + paises[i]);
        }
        System.out.println(":::::::::::::::::::::::::::");
        // Recorremos la matriz con un bucle for each: Te despreocupas de donde empieza y hasta donde llega
        for (String item : paises) {
            //System.out.println(item);
            System.out.println("País: "  + item);
        }
    }
}
