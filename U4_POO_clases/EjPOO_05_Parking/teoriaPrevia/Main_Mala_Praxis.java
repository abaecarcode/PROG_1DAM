package EjPOO_05_Parking.teoriaPrevia;


/*
* Emplear Exeption directamente puede:
*   a) Lanzar excepciones genéricas con throw new Exception("Mensaje de error")
*   b) No especificar el tipo de error ocurrido, lo que dificulta su tratamiento en el catch
*   c) Hacer que el código sea menos mantenible y dificil de depurar
*
* */

public class Main_Mala_Praxis {
    public static void main(String[] args) {
        // Veamos un ejemplo de mala práctica en el uso de las excepciones.

        // Si comprobáis su uso. Únicamente por pantalla y en un mensaje se aclara que se ha cometido un error. Pero en ningún caso se distingue el tipo de error en el catch. Las dos excepciones son Exception, y no se diferencian.

        // Si se añaden más validaciones, el catch seguirá capturandolo todo de la misma manera y no se sabrá que tipo de error ocurrió

        try {
            validadEdad(-5);
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
        try {
            validadEdad(150);
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }

    private static void validadEdad(int edad) throws Exception {
        if (edad < 0) {
            throw new Exception("La edad no puede ser negativa");
        }
        if (edad > 120) {
            throw new Exception("La edad es muy alta, nadie vive tanto");
        }
    }
}
