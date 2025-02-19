package EjPOO_05_Parking.teoriaPrevia;

/*
 * Ventajas de usar una excepción personalizada:
 *   a) Claridad en el manejo de errores. Con EdadInvalidaException tu mismo puedes indicar en esa clase el problema.
 *   b) Fácil mantenimiento. Si queremos capturar más excepciones en el futuro, cada una tendrá su propio catch
 *   c) Si en otro punto del código hay más valiciones, se pueden diferenciar correctamente
 *
 * */

public class Main_Buena_Praxis {
    public static void main(String[] args) {
        try {
            validarEdad(-5);
        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            validarEdad(150);
        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0){
            throw new EdadInvalidaException("La edad no puede ser negativa");
        }
        if (edad > 150){
            throw new EdadInvalidaException("La edad es demasiado alta para ser real");
        }
    }
}
