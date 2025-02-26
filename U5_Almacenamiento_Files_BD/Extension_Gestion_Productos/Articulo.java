package Extension_Gestion_Productos;

public abstract class Articulo {
    protected int codigo;
    protected String nombre;
    protected double precio;
    protected int cantidadStock;

    public Articulo(int codigo, String nombre, double precio, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadStock = cantidad;
    }

    // Métodos getters para acceder a los atributos
    public int getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public int getCantidadStock() { return cantidadStock; }

    public void mostrarInformacion() {}
}
