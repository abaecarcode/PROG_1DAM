package EjPOO_05_Parking;

/**
 * Clase de excepción personalizada para manejar errores relacionados con el estacionamiento.
 * Esta excepción se lanza cuando ocurre un error relacionado con las operaciones de estacionamiento.
 *
 * @author Alejandro Torres
 */
public class ParkingException extends Exception {

    private final String mensaje;
    private final String matricula;

    /**
     * Construye una nueva ParkingException con el mensaje de detalle y el número de matrícula especificados.
     *
     * @param mensaje El mensaje de detalle (que se guarda para su posterior recuperación por el método getMessage()).
     * @param matricula El número de matrícula asociado con el error de estacionamiento.
     */
    public ParkingException(String mensaje, String matricula) {
        super(mensaje); // Llama al constructor de la superclase para establecer el mensaje de detalle
        this.mensaje = mensaje;
        this.matricula = matricula;
    }

    /**
     * Devuelve el mensaje de detalle asociado con esta excepción.
     *
     * @return El mensaje de detalle.
     */
    @Override
    public String getMessage() {
        return mensaje;
    }

    /**
     * Devuelve el número de matrícula asociado con este error de estacionamiento.
     *
     * @return El número de matrícula.
     */
    public String getMatricula() {
        return matricula;
    }
}
