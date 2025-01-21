package Variables;


/*
* Casting: se emplea para convertir tipos primitivos compatibles.
*
* Parsing: es necesario cuando trabajas con tipos incompatibles, como convertir una cadena (String) a un tipo primitivo (int, double, etc). Esto se hace utilizando metodos específicos de las clases envolventes (Integer, Double, etc)
*
* Parsing: ideal para trabajr con entradas de usuario o datos externos
*
* Casting: ideal para conversiones simples entre números
* */

public class CombinarCastingParsing {
    public static void main(String[] args) {

        String numeroComoTexto = "42";
        int numero;

        numero = Integer.parseInt(numeroComoTexto);
        System.out.println(numero);
        System.out.println(numero / 7);

        // Realiza un ejemplo combinando parsing y casting

        String entrada = "120.45";
        // Parseo de la entrada
        double numeroDecimal = Double.parseDouble(entrada);
        // Casteo de numero entero
        int numeroEntero = (int) numeroDecimal;
        System.out.println(numeroEntero);
    }
}
