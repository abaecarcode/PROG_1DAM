package Extension_Gestion_Productos;

// Nueva clase Categoria que se añade al proyecto de gestión de productos para clasificar los productos en diferentes categorías.
class Categoria {
    private String nombre;
    private String descripcion;

    public Categoria(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void mostrarInformacion() {
        System.out.println("Categoría: " + nombre + " - " + descripcion);
    }
}
