package Extension_Gestion_Productos;


/**
 * El tipo o clase Proveedor. En lugar de almacenar solo los datos básicos del proveedor como Strings, podemos crear una clase Proveedor y hacer que Producto la contenga.
 */
public class Proveedor {
    private String nombre;
    private String telefono;

    /**
     * Instancia un nuevo proveedor.
     *
     * @param nombre   the nombre
     * @param telefono the telefono
     */
    public Proveedor(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }


    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    /**
     * Mostrar información.
     */
    public void mostrarInformacion() {
        System.out.println("Proveedor: " + nombre + ", Teléfono: " + telefono);
    }
}
