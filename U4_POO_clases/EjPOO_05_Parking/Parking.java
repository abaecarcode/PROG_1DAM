package EjPOO_05_Parking;

import EjPOO_05_Parking.ParkingException;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Clase que representa un Parking.
 * Implementa el control de ocupación de plazas y manejo de excepciones personalizadas.
 * Se usa una lista dinámica (ArrayList) para almacenar matrículas.
 *
 * Conceptos de POO aplicados:
 * - Encapsulación: Se protege la lista de matrículas y el nombre del parking.
 * - Excepciones personalizadas: Se lanza la clase ParkingException en casos específicos.
 * - Composición: La clase Parking contiene una lista de matrículas.
 *
 * @author Alejandro Torres
 */
public class Parking {

    /** Lista de matrículas que representa las plazas del parking. */
    private final ArrayList<String> matriculas;
    /** Nombre del parking. */
    private final String nombre;

    /**
     * Constructor de la clase Parking.
     * Inicializa el nombre del parking y crea una lista con las plazas vacías.
     *
     * @param nombre Nombre del parking.
     * @param plazas Número total de plazas en el parking.
     */
    public Parking(String nombre, int plazas) {
        this.nombre = nombre;
        // Se inicializa la lista con el número de plazas y se llenan con valores null
        matriculas = new ArrayList<>(Collections.nCopies(plazas, null));
    }

    /**
     * Obtiene el nombre del parking.
     *
     * @return Nombre del parking.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Permite la entrada de un coche en una plaza específica del parking.
     *
     * @param matricula Matrícula del coche.
     * @param plaza Número de la plaza donde se aparcará.
     * @throws ParkingException Si la plaza no existe, está ocupada o la matrícula es inválida.
     */
    public void entrada(String matricula, int plaza) throws ParkingException {

        if (plaza >= matriculas.size() || plaza < 0) {
            throw new ParkingException("Plaza inexistente", matricula);
        }

        if (matricula == null || matricula.length() < 4) {
            throw new ParkingException("Matrícula incorrecta", matricula);
        }

        if (matriculas.get(plaza) != null) {
            throw new ParkingException("Plaza ocupada", matricula);
        }

        if (matriculas.contains(matricula)) {
            throw new ParkingException("Matrícula repetida", matricula);
        }

        matriculas.set(plaza, matricula);
    }

    /**
     * Permite la salida de un coche del parking.
     *
     * @param matricula Matrícula del coche que sale.
     * @return Número de la plaza que ha quedado libre.
     * @throws ParkingException Si la matrícula no está registrada en el parking.
     */
    public int salida(String matricula) throws ParkingException {

        if (!matriculas.contains(matricula)) {
            throw new ParkingException("Matrícula no existente", matricula);
        }

        int plaza = matriculas.indexOf(matricula);
        matriculas.set(plaza, null);
        return plaza;
    }

    /**
     * Devuelve el número total de plazas del parking.
     *
     * @return Cantidad total de plazas.
     */
    public int getPlazasTotales() {
        return matriculas.size();
    }

    /**
     * Devuelve la cantidad de plazas ocupadas.
     *
     * @return Número de plazas ocupadas.
     */
    public int getPlazasOcupadas() {
        return getPlazasTotales() - getPlazasLibres();
    }

    /**
     * Devuelve la cantidad de plazas libres en el parking.
     *
     * @return Número de plazas disponibles.
     */
    public int getPlazasLibres() {
        return Collections.frequency(matriculas, null);
    }

    /**
     * Devuelve una representación en cadena del estado del parking.
     *
     * @return Estado del parking con cada plaza y su matrícula o "(vacía)" si está libre.
     */
    @Override
    public String toString() {

        StringBuilder cadena = new StringBuilder("Parking " + nombre + "\n");
        cadena.append("-------------------\n");
        for (int i = 0; i < matriculas.size(); i++) {
            cadena.append("Plaza ").append(i).append(": ");
            // Se reemplaza el operador ternario por una estructura if-else
            if (matriculas.get(i) == null) {
                cadena.append("(vacía)");
            } else {
                cadena.append(matriculas.get(i));
            }
            cadena.append("\n");
        }
        cadena.append("-------------------\n");

        return cadena.toString();
    }
}
